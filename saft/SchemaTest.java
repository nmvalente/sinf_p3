import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;

import org.xml.sax.ErrorHandler;

import java.io.File;


public class SchemaTest {

    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Usage: java SchemaTest xsdFile xmlFile");
        }
        else {
            File xsd = new File(args[0]);
            File xml = new File(args[1]);
            validate(xml, xsd);
        }
    }

    private static void validate(File xml, File xsd) {
        StreamSource xmlFile = new StreamSource(xml);
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        ErrorHandler saxErrorHandler = new SAXErrorHandler();
        try {
            Schema schema = factory.newSchema(xsd);
            Validator validator = schema.newValidator();
            validator.setErrorHandler(saxErrorHandler);
            validator.validate(xmlFile);
            System.out.println("- XML validation complete.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}