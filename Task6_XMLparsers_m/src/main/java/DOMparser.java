import org.w3c.dom.*;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMparser {
    public static void domParse(String path){
        System.out.println("---------------------------------------------------------");
        System.out.println("DOM parser operates");
        System.out.println("---------------------------------------------------------");
        File xmlFile = new File(path);
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            //Отримуємо об"єкт DocumentBuilder
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            //Парсимо об"єкт DocumentBuilder і отримуємо об"єкт Document
            Document document = documentBuilder.parse(xmlFile);
            //Повертаємо об"єкт класу Element, отримуємо кореневий елемент
            Element root = document.getDocumentElement();
            System.out.println("Root element: " + root.getNodeName());
            System.out.println("------------------");

            NodeList nodeList = root.getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {
                //за номером отримуємо вузол
                Node node = nodeList.item(i);
                //Перевіряємо конкретний тип, якщо він є елементом, то входимо в нього
                if (node.getNodeType()==Node.ELEMENT_NODE){
                    Element element = (Element) node;

                    System.out.println("Flower's name - " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("soil - " + element.getElementsByTagName("soil").item(0).getTextContent());
                    System.out.println("origin - " + element.getElementsByTagName("origin").item(0).getChildNodes().item(0).getNodeValue());

                    NamedNodeMap namedNodeMap = element.getElementsByTagName("visual_parameters").item(0).getAttributes();
                    System.out.println("visual parameters: ");
                    System.out.println("  stem color - " + namedNodeMap.getNamedItem("stem_color").getNodeValue());
                    System.out.println("  leaves color - " + namedNodeMap.getNamedItem("leaves_color").getNodeValue());
                    System.out.println("  average height - " + namedNodeMap.getNamedItem("average_height").getNodeValue() + "cm");

                    namedNodeMap = element.getElementsByTagName("growing_tips").item(0).getAttributes();
                    System.out.println("growing tips: ");
                    System.out.println("  temperature - " + namedNodeMap.getNamedItem("temperature").getNodeValue() + "C");
                    System.out.println("  lightening - " + namedNodeMap.getNamedItem("lightening").getNodeValue());
                    System.out.println("  watering - " + namedNodeMap.getNamedItem("watering").getNodeValue() + "ml");
                    System.out.println("way of multiplying - " + element.getElementsByTagName("multiplying").item(0).getChildNodes().item(0).getNodeValue() + "\n");

                }
            }


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
