package com.adenki.smpp;

/**
 * AlreadyBoundException
 * 
 * @version $Id: AlreadyBoundException.java 452 2009-01-15 16:56:36Z orank $
 */
public class AlreadyBoundException extends com.adenki.smpp.SMPPRuntimeException {
    static final long serialVersionUID = 2L;
    
    public AlreadyBoundException() {
        super();
    }

    /**
     * Construct a new AlreadyBoundException with specified message.
     */
    public AlreadyBoundException(String s) {
        super(s);
    }
}

