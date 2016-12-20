/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.InputStream;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.ReasonerRegistry;
import org.apache.jena.shared.JenaException;
import org.apache.jena.util.FileManager;



/**
 *
 * @author icarv
 */
public class OntoConnection {
    
    public static OntModel OntoConnection(){
        
        String f = "C:\\Seco 5\\seco 5.owl";        
        OntModelSpec especRacioc = OntModelSpec.OWL_DL_MEM;
        OntModel seco = ModelFactory.createOntologyModel(especRacioc, null);
        OntModel data = ModelFactory.createOntologyModel(especRacioc, null);

        try {
            InputStream in = FileManager.get().open(f);
            seco.read(in, "RDF/XML");            
            Reasoner reasoner = ReasonerRegistry.getOWLReasoner();
            reasoner = reasoner.bindSchema(seco);
            InfModel infmodel = ModelFactory.createInfModel(reasoner,seco);
            return seco;
        } catch (JenaException je) {
            System.out.println("ERROR" + je.getMessage());
            je.printStackTrace();
            System.exit(0);
        }
        
        return null;
    }
    
    
}
