package com.adenki.smpp.message;

/**
 * Bind to the SMSC as a transmitter.
 * 
 * @version $Id: BindTransmitter.java 452 2009-01-15 16:56:36Z orank $
 */
public class BindTransmitter extends Bind {
    private static final long serialVersionUID = 2L;
    /**
     * Construct a new BindTransmitter.
     */
    public BindTransmitter() {
        super(CommandId.BIND_TRANSMITTER);
    }
}

