package sax_parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {
    boolean bName = false;
    boolean bSoil = false;
    boolean bOrigin = false;
    boolean bVisual_parameters = false;
    boolean bGrowing_tips = false;
    boolean bMultiplying = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equalsIgnoreCase("name")) {
            bName = true;
        } else if (qName.equalsIgnoreCase("soil")) {
            bSoil = true;
        } else if (qName.equalsIgnoreCase("origin")) {
            bOrigin = true;
        } else if (qName.equalsIgnoreCase("visual_parameters")) {
            bVisual_parameters = true;
            System.out.println("visual parameters");
            String stemColor = attributes.getValue("stem_color");
            System.out.println("  Stem color: " + stemColor);
            String leavesColor = attributes.getValue("leaves_color");
            System.out.println("  Leaves color: " + leavesColor);
            String averageHeight = attributes.getValue("average_height");
            System.out.println("  Average height: " + averageHeight + "cm");
        } else if (qName.equalsIgnoreCase("growing_tips")) {
            bGrowing_tips = true;
            System.out.println("growing tips");
            String temperature = attributes.getValue("temperature");
            System.out.println("  temperature - " + temperature + "C");
            String lightening = attributes.getValue("lightening");
            System.out.println("  lightening - " + lightening);
            String watering = attributes.getValue("watering");
            System.out.println("  watering - " + watering + "ml");
        } else if (qName.equalsIgnoreCase("multiplying")) {
            bMultiplying = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        if (qName.equalsIgnoreCase("flower")) {
            System.out.println("End Element: " + qName + "\n");
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (bName) {
            System.out.println("Flower's Name: " + new String(ch, start, length));
            bName = false;
        } else if (bSoil) {
            System.out.println("Soil: " + new String(ch, start, length));
            bSoil = false;
        } else if (bOrigin) {
            System.out.println("Origin from: " + new String(ch, start, length));
            bOrigin = false;
        } else if (bMultiplying) {
            System.out.println("Multiplying: " + new String(ch, start, length));
            bMultiplying = false;
        }
    }
}
