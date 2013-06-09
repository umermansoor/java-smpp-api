package com.adenki.smpp.message;

/**
 * Bind to the SMSC as a transceiver.
 * 
 * @version $Id: BindTransceiver.java 452 2009-01-15 16:56:36Z orank $
 */
public class BindTransceiver extends Bind {
    private static final long serialVersionUID = 2L;
    /**
     * Construct a new BindTransceiver.
     */
    public BindTransceiver() {
        super(CommandId.BIND_TRANSCEIVER);
    }
}

