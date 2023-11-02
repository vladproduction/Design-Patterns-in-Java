package vladproduction.abstract_factory.demo;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class AbstractFactoryDemoExample {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        String xml = "<document><body><stock>APL</stock></body></document>";
        ByteArrayInputStream baits = new ByteArrayInputStream(xml.getBytes());


        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document doc = factory.parse(baits);

        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());
    }
}
