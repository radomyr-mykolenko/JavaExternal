import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;


public class MyStAXparser {

    boolean bName = false;
    boolean bSoil = false;
    boolean bOrigin = false;
    boolean bVisual_parameters = false;
    boolean bGrowing_tips = false;
    boolean bMultiplying = false;
    public ArrayList<String> dataForObject;

    public MyStAXparser() {
        dataForObject = new ArrayList<>(30);
    }


    public ArrayList<String> parse(String path) {

        System.out.println("--------------------------------------------------");
        System.out.println("StAX parser operates");
        System.out.println("--------------------------------------------------\n");
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader =
                    factory.createXMLEventReader(new FileReader(path));

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();


                switch (event.getEventType()) {

                    case XMLStreamConstants.START_ELEMENT:

                        StartElement startElement = event.asStartElement();
                        String qName = startElement.getName().getLocalPart();

                        if (qName.equalsIgnoreCase("name")) {
                            bName = true;
                        } else if (qName.equalsIgnoreCase("soil")) {
                            bSoil = true;
                        } else if (qName.equalsIgnoreCase("origin")) {
                            bOrigin = true;
                        } else if (qName.equalsIgnoreCase("visual_parameters")) {
                            bVisual_parameters = true;
                            System.out.println("visual parameters");
                            Iterator<Attribute> attributes = startElement.getAttributes();

                            String value = attributes.next().getValue();
                            System.out.println("  average_height - " + value);
                            dataForObject.add(value);

                            value = attributes.next().getValue();
                            System.out.println("  leaves_color - " + value);
                            dataForObject.add(value);

                            value = attributes.next().getValue();
                            System.out.println("  stem_color - " + value);
                            dataForObject.add(value);

                        } else if (qName.equalsIgnoreCase("growing_tips")) {
                            bGrowing_tips = true;
                            System.out.println("growing tips");
                            Iterator<Attribute> attributes = startElement.getAttributes();

                            String value = attributes.next().getValue();
                            System.out.println("  lightening - " + value);
                            dataForObject.add(value);

                            value = attributes.next().getValue();
                            System.out.println("  watering - " + value + "ml");
                            dataForObject.add(value);

                            value = attributes.next().getValue();
                            System.out.println("  temperature - " + value + "C");
                            dataForObject.add(value);

                        } else if (qName.equalsIgnoreCase("multiplying")) {
                            bMultiplying = true;
                        }
                        break;

                    case XMLStreamConstants.CHARACTERS:
                        Characters characters = event.asCharacters();
                        if (bName) {
                            System.out.println("Flower's name: " + characters.getData());
                            dataForObject.add(characters.getData());

                            bName = false;
                        }
                        if (bSoil) {
                            System.out.println("soil: " + characters.getData());
                            dataForObject.add(characters.getData());

                            bSoil = false;
                        }
                        if (bOrigin) {
                            System.out.println("origin from: " + characters.getData());
                            dataForObject.add(characters.getData());

                            bOrigin = false;
                        }
                        if (bMultiplying) {
                            System.out.println("multiplying - " + characters.getData());
                            dataForObject.add(characters.getData());

                            bMultiplying = false;
                        }
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        EndElement endElement = event.asEndElement();

                        if (endElement.getName().getLocalPart().equalsIgnoreCase("flower")) {
                            System.out.println("End Element : flower");
                            System.out.println();
                        }
                        break;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        return dataForObject;

    }
}
