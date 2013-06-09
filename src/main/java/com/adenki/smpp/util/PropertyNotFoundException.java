package com.adenki.smpp.util;

import com.adenki.smpp.SMPPRuntimeException;

/**
 * @version $Id: PropertyNotFoundException.java 452 2009-01-15 16:56:36Z orank $
 */
public class PropertyNotFoundException extends SMPPRuntimeException {
    static final long serialVersionUID = 2L;

    public PropertyNotFoundException() {
        super();
    }

    public PropertyNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public PropertyNotFoundException(String msg) {
        super(msg);
    }

    public PropertyNotFoundException(Throwable cause) {
        super(cause);
    }
}

