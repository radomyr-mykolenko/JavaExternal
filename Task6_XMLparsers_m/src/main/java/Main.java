import sax_parser.SAXparser;

public class Main {

    public static void main(String[] args) {
        String xmlFilepath = "D:\\epam\\JavaExternal\\Task6_XMLparsers_m\\src\\main\\java\\orangery.xml";
        DOMparser.domParse(xmlFilepath);
        SAXparser.parse(xmlFilepath);

    }
}
