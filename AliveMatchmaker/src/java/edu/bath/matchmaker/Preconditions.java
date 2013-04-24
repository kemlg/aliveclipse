package edu.bath.matchmaker;

import org.mindswap.owl.OWLValue;
import org.mindswap.owls.process.Condition;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.service.Service;
import org.mindswap.query.ValueMap;

/**
 * Utility that tests whether the preconditions of a service are satisfied by a particular input assignment.
 *
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public final class Preconditions {
    private Preconditions() { }
    
    /**
     * Tests whether the preconditions of the specified service are satisfied by the given input assignment.
     *
     * @param service the service of which the preconditions to be tested
     * @param assignment the assignment with which to test the preconditions of the service. An assignment
     * should provide a value for every service's input (which can be accessed by {@code service.getProcess().getInputs()})
     * @return {@code true} iff the service's preconditions are satisfied by the given (or it defines no preconditions)
     */
    public static boolean accept(Service service, ValueMap<Input, OWLValue> assignment) {
        for (Condition condition : service.getProcess().getConditions()) {
            if (service.getKB().isTrue(condition, assignment) == false) {
                return false;
            }
        }
        return true;
    }
}