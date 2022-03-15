package ca.nl.cna.java2.exceptions;

import java.io.IOException;

/**
 * An Exception to use when a policy that's being loaded (from an external data source) that does
 * not have correctly defined parameters. This may include the following:
 *  - No start / end date
 *  - Unclear coverage
 *  - Unclear premium
 *  - Unclear or unknown status
 *
 * @author Josh
 */
public class PolicyNotWellFormedException extends IOException {

    private static final String msg = "Policy is not well formed - examine policy source for resolution";

    /**
     * Basic constructor
     */
    public PolicyNotWellFormedException() {
        super(msg);
    }

    /**
     * Constructor with custom message
     * @param message
     */
    public PolicyNotWellFormedException(String message) {
        super(message);
    }

    /**
     * Constructor with chaining
     * @param cause
     */
    public PolicyNotWellFormedException(Throwable cause) {
        super(msg, cause);
    }

    /**
     * Constructor with chaining and customer message
     * @param message
     * @param cause
     */
    public PolicyNotWellFormedException(String message, Throwable cause) {
        super(message, cause);
    }

}
