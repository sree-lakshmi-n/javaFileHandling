package xmlDemo.DOMParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DomParserDemo {
    private static Document readXML(String filePath) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(filePath));
        document.getDocumentElement().normalize();
        return document;
    }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Document document = readXML("src/xml/DOMParser/friends.xml");
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName()); // root node
        System.out.println("------------------------");

        NodeList nodeList = root.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("\nName: " + ((Element) node).getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Nickname: " + ((Element) node).getElementsByTagName("nickname").item(0).getTextContent());
            }
        }
    }
}
