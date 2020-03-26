package com.radomyr;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParser {
    Flower flower;
    public Flower fromXMLtoObject(){
    DefaultHandler defaultHandler = new DefaultHandler(){
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            super.startElement(uri, localName, qName, attributes);
        }
    };

    return flower;
    }

}
