import sax_parser.SAXparser;

public class Main {

    public static void main(String[] args) {
        String xmlFilepath = "D:\\epam\\JavaExternal\\Task6_XMLparsers_m\\src\\main\\java\\orangery.xml";
        DOMparser.domParse(xmlFilepath);
        SAXparser.parse(xmlFilepath);

// creating objects from file by hand-made builder
        Orangery orangery = new FlowerBuilder().builtFlowers(new MyStAXparser().parse(xmlFilepath));

        System.out.println("List of objects created from XML file " + xmlFilepath);

        orangery.displayFlowers();


    }
}
