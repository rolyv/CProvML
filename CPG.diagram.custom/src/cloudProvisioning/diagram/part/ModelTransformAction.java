package cloudProvisioning.diagram.part;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;


/**
 * @generated
 */
public class ModelTransformAction extends AbstractHandler {	
	
	public Object execute(ExecutionEvent event) throws ExecutionException {		
		IEditorPart editorPart = HandlerUtil.getActiveEditorChecked(event);
		
		if (editorPart != null)
		{
			// Get reference to editor and get URI for current file path
			IEditorInput input = editorPart.getEditorInput();			
			org.eclipse.emf.common.util.URI uri = ((URIEditorInput)input).getURI();
			
			// convert URI to OS file string
			String diagramFileName = uri.toFileString();
			
			// trim off the file extension
			int endIndex = diagramFileName.indexOf(".cloudprovisioning_diagram");
			String fileName = diagramFileName.substring(0, endIndex);
			
			Document document;
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			
			try {
				// read in XSL from resources
	            InputStream stylesheet = getClass().getResourceAsStream("resources/xcprovml.xsl");
	            // Open file to G-CProvML xml file
	            File datafile = new File(fileName + ".cloudprovisioning");

	            // Create document builder which will read in G-CProvML
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            document = builder.parse(datafile);
	            
	            // Create document transformer that will apply XSL
	            TransformerFactory tFactory = TransformerFactory.newInstance();
	            StreamSource stylesource = new StreamSource(stylesheet); 
	            Transformer transformer = tFactory.newTransformer(stylesource);
	            
	            // Create output file for X-CProvML and apply transform
	            DOMSource source = new DOMSource(document);
	            File xcprovml = new File(fileName + ".xcprovml");
	            StreamResult result = new StreamResult(xcprovml);
	            transformer.transform(source, result);
	            
	            // Begin applying XSD validation	            
	            factory.setValidating(false);
	    		factory.setNamespaceAware(true);
	    		
	    		SchemaFactory schemaFactory = 
	    			    SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
	    		
	    		// Read XSD from resources
	    		InputStream schema = getClass().getResourceAsStream("resources/xcprovml.xsd");
	    		factory.setSchema(schemaFactory.newSchema(new StreamSource(schema)));
	    	
	    		// read in X-CProvML and validate against XSD
	    		// all errors will be handled by SimpleErrorHandler
	    		builder = factory.newDocumentBuilder();
	    		builder.setErrorHandler(new SimpleErrorHandler());
	            document = builder.parse(xcprovml);
	            
	        } catch (TransformerConfigurationException tce) {
	        	JOptionPane.showMessageDialog(null, "Ahhhhhhhhhhhhhhhhh!!!!!!", "Shit happens", JOptionPane.ERROR_MESSAGE);
	        } catch (TransformerException te) {
	        	JOptionPane.showMessageDialog(null, "Ahhhhhhhhhhhhhhhhh!!!!!!", "Shit happens", JOptionPane.ERROR_MESSAGE);
	        } catch (SAXException sxe) {
	        	JOptionPane.showMessageDialog(null, "Ahhhhhhhhhhhhhhhhh!!!!!!", "Shit happens", JOptionPane.ERROR_MESSAGE);
	        } catch (ParserConfigurationException pce) {
	        	JOptionPane.showMessageDialog(null, "Ahhhhhhhhhhhhhhhhh!!!!!!", "Shit happens", JOptionPane.ERROR_MESSAGE);
	        } catch (IOException ioe) {
	        	JOptionPane.showMessageDialog(null, "Ahhhhhhhhhhhhhhhhh!!!!!!", "Shit happens", JOptionPane.ERROR_MESSAGE);
	        }			
		}
				
		return null;
	}

}
