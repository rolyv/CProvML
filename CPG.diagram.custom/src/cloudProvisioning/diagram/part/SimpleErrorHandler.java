package cloudProvisioning.diagram.part;

import javax.swing.JOptionPane;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SimpleErrorHandler implements ErrorHandler {
    public void warning(SAXParseException e) throws SAXException {
//    	String message = String.format("Model returned the following XSD validation errors:\n%s", e.getMessage());
//        JOptionPane.showMessageDialog(null, message, "Transformation Error", JOptionPane.ERROR_MESSAGE);
    }

    public void error(SAXParseException e) throws SAXException {
    	String message = String.format("Model returned the following XSD validation errors:\n%s", e.getMessage());
        JOptionPane.showMessageDialog(null, message, "Transformation Error", JOptionPane.ERROR_MESSAGE);
    }

    public void fatalError(SAXParseException e) throws SAXException {
    	String message = String.format("Model returned the following XSD validation errors:\n%s", e.getMessage());
        JOptionPane.showMessageDialog(null, message, "Transformation Error", JOptionPane.ERROR_MESSAGE);
    }
}