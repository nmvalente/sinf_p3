import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SAXErrorHandler implements ErrorHandler {

    public void warning(SAXParseException ex) {
        System.err.println("- XML warning: " + ex.toString());
    }

    public void error(SAXParseException ex) {
        System.err.println("- XML error: " + ex.toString());
    }

    public void fatalError(SAXParseException ex) throws SAXException {
        throw ex;
    }

}