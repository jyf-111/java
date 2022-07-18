package XML;

import javax.xml.parsers.*;

import org.w3c.dom.*;

public class XmlUnit {
    public static void main(String[] args) {
        System.out.println("list names:\n");
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc;
            doc = db.parse("config.xml");

            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            
            nl = doc.getElementsByTagName("className");
            classNode = nl.item(0).getFirstChild();
            cName = classNode.getNodeValue();
            System.out.println(cName);
            System.out.println(nl.item(1).getFirstChild().getNodeValue());
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}
