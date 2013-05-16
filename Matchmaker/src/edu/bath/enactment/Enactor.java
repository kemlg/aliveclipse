package edu.bath.enactment;

import impl.owls.process.execution.StandardExecutionValidator;
import org.mindswap.exceptions.ExecutionException;
import org.mindswap.owl.OWLValue;
import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.process.variable.Input;
import org.mindswap.owls.process.execution.ProcessExecutionEngine;
import org.mindswap.owls.process.Process;
import org.mindswap.query.ValueMap;

/**
 * A service enactment component.
 * 
 * @author Andreou Dimitris, email: jim.andreou (at) gmail.com
 */
public class Enactor {
    public Enactor() { }

    private static final StandardExecutionValidator executionValidator = new StandardExecutionValidator(); static {
        executionValidator.setPreconditionCheck(false);
        executionValidator.setResultCheck(false);
    }

    public void execute(Process process, ValueMap<Input, OWLValue> inputs) throws ExecutionException {
        ProcessExecutionEngine exec = OWLSFactory.createExecutionEngine();
        exec.setExecutionValidator(executionValidator);

        exec.execute(process, inputs, process.getKB());
    }
}
