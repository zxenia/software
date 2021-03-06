package org.nlp2rdf.core.vocab;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.vocabulary.OWL;
/**
 *
 *
 * @author kurzum
 *
 */
public enum RLOGIndividuals {

    /**
     * ERROR -> The ERROR level designates error events that might still allow the application to continue running.
     */
    ERROR,

    /**
     * TRACE -> The DEBUG Level designates fine-grained informational events that are most useful to debug an application.
     */
    DEBUG,

    /**
     * OFF -> The OFF has the highest possible rank and is intended to turn off logging.
     */
    OFF,

    /**
     * FATAL -> The FATAL level designates very severe error events that will presumably lead the application to abort.
     */
    FATAL,

    /**
     * WARN -> The WARN level designates potentially harmful situations.
     */
    WARN,

    /**
     * TRACE -> The TRACE Level designates finer-grained informational events than the DEBUG.
     */
    TRACE,

    /**
     * TODO add label -> TODO add comment
     */
    mylog1,

    /**
     * INFO -> The INFO level designates informational messages that highlight the progress of the application at coarse-grained level.
     */
    INFO,

    /**
     * ALL -> The ALL has the lowest possible rank and is intended to turn on all logging.
     */
    ALL;

    String uri;

    RLOGIndividuals() {
        this.uri = "http://persistence.uni-leipzig.org/nlp2rdf/ontologies/rlog#" + name();
    }

    public String getUri() {
        return uri;
    }

    @Override
    public String toString() {
        return "rlog:" + name();
    }

    public Individual getIndividual(OntModel model) {
        return model.createIndividual(getUri(), OWL.Thing);
    }
}