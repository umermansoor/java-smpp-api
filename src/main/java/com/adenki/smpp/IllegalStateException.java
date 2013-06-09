package com.adenki.smpp;

/**
 * @version $Id: IllegalStateException.java 452 2009-01-15 16:56:36Z orank $
 */
public class IllegalStateException extends SMPPRuntimeException {
    private static final long serialVersionUID = 2L;

    public IllegalStateException() {
        super();
    }

    public IllegalStateException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public IllegalStateException(String msg) {
        super(msg);
    }

    public IllegalStateException(Throwable cause) {
        super(cause);
    }
}
