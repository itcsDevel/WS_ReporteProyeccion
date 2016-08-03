package cl.cnsv.wsreporteproyeccion.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import com.thoughtworks.xstream.XStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import org.xml.sax.InputSource;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.io.StringWriter;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

/**
 * XML processing utilities.
 * @author Mauricio Pizarro Hucke
 * @since 2007-04-12
 * @version 1.0
 */

public class XMLUtil {

    public XStream xstream  = new XStream();
    /**
     * Defaul Contructor Method
     */
    public XMLUtil() {
    }

    /**
     * Get and load an XML string into a JDOM Document object.
     * @param stringXML
     * @return
     * @throws org.jdom.JDOMException
     * @throws java.io.IOException
     */
    public static Document getDocument(String stringXML) throws JDOMException, IOException {
        SAXBuilder builder = new  SAXBuilder(false);
        InputStream isXml = new ByteArrayInputStream(stringXML.getBytes("UTF-8"));
        return builder.build(isXml);
    }

    /**
     * Get and load an XML string into a DOM4J Document object.
     * @param stringXML
     * @return
     * @throws DocumentException
     */
    public static org.dom4j.Document getDocument2(String stringXML) throws DocumentException, IOException{
    	SAXReader reader = new SAXReader();
    	InputStream isXml = new ByteArrayInputStream(stringXML.getBytes("UTF-8"));
    	return reader.read(isXml);
    }

    /**
     * Get and load an XML string into a W3C Document object.
     *
     * @param archivoXML String
     * @return Document
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static org.w3c.dom.Document getDocument3(String archivoXML) throws
    	ParserConfigurationException, IOException, SAXException {
    	StringReader readerXML = new StringReader(archivoXML);
    	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    	DocumentBuilder db = dbf.newDocumentBuilder();
    	org.w3c.dom.Document document = db.parse(new InputSource(readerXML));
        return document;
    }

    public static String getString(Node node) throws
      TransformerConfigurationException, TransformerException, IOException {

      DOMSource domSource = new DOMSource(node);
      StringWriter stringWriter = new StringWriter();
      StreamResult result = new StreamResult(stringWriter);
      TransformerFactory tFactory = TransformerFactory.newInstance();
      Transformer transformer = tFactory.newTransformer();
      transformer.setOutputProperty("indent", "yes");
      transformer.transform(domSource, result);
      result.getWriter().flush();

      return result.getWriter().toString();
    }

    public static String getString(Document doc) throws IOException {
        XMLOutputter outputter = new XMLOutputter();
        return outputter.outputString(doc);
    }

    public static String toXML(Object obj){
        XStream xstream = new XStream();
        return xstream.toXML(obj);
    }

    public static Object fromXML(String xml) {
        XStream xstream = new XStream();
        return xstream.fromXML(xml);
    }
}
