package com.adenki.smpp;

/**
 * $Id: UnsupportedOperationException.java 452 2009-01-15 16:56:36Z orank $
 */
public class UnsupportedOperationException extends SMPPRuntimeException {
    static final long serialVersionUID = 2L;
    
    public UnsupportedOperationException() {
    }

    public UnsupportedOperationException(String msg) {
        super(msg);
    }
}
