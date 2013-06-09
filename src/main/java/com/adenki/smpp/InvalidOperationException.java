package com.adenki.smpp;

/**
 * InvalidOperationException
 * 
 * @version $Id: InvalidOperationException.java 452 2009-01-15 16:56:36Z orank $
 */
public class InvalidOperationException extends com.adenki.smpp.SMPPException {
    static final long serialVersionUID = 2L;
    
    public InvalidOperationException() {
    }

    /**
     * Construct a new InvalidOperationException with specified message.
     */
    public InvalidOperationException(String s) {
        super(s);
    }
}

