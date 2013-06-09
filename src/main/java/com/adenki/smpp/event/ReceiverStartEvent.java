package com.adenki.smpp.event;

import com.adenki.smpp.Session;

/**
 * Event generated when the receiver thread starts. Usually applications can
 * ignore this message as they don't need to do anything when the receiver
 * thread starts.
 * 
 * @version $Id: ReceiverStartEvent.java 452 2009-01-15 16:56:36Z orank $
 */
public class ReceiverStartEvent extends SMPPEvent {
    /**
     * Create a new ReceiverStartEvent.
     */
    public ReceiverStartEvent(Session source) {
        super(RECEIVER_START, source);
    }
}

