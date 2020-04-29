import sax_parser.SAXparser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        String xmlFilepath = "D:\\epam\\JavaExternal\\Task6_XMLparsers_m\\src\\main\\java\\orangery.xml";
        DOMparser.domParse(xmlFilepath);
        SAXparser.parse(xmlFilepath);

        // creating objects from file by hand-made builder
        ArrayList<Flower> orangery = new FlowerBuilder().builtFlowers(new MyStAXparser().parse(xmlFilepath));

        System.out.println("List of objects created from XML file " + xmlFilepath);

        for (Flower element : orangery) {
            System.out.println(element.toString());
        }

        // сортування об'єктів за температурою

        ComparatorByTemperature comparatorByTemperature = new ComparatorByTemperature();

        /*Collections.sort(orangery, Comparator.comparingInt(o -> o.getGrowingTips().getTemperature()));
        for(Flower elements: orangery){
            System.out.println(elements.toString());
        }*/

        //Flower [] arrayForSorting = (Flower[]) orangery.toArray();
        Flower[] arrayForSorting = FlowersArrayListToArray.convert(orangery);
        Arrays.sort(arrayForSorting, comparatorByTemperature);

        System.out.println("\n*****************************");
        System.out.println("sorted objects by temperature");

        for (int i = 0; i < arrayForSorting.length; i++) {
            System.out.println(arrayForSorting[i].toString());
        }

    }
}
