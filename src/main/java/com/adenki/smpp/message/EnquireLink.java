package com.adenki.smpp.message;

/**
 * Check the link status. This message can originate from either an ESME or the
 * SMSC. It is used to check that the entity at the other end of the link is
 * still alive and responding to messages. Usually used by the SMSC after a
 * period of inactivity to decide whether to close the link.
 * 
 * @version $Id: EnquireLink.java 452 2009-01-15 16:56:36Z orank $
 */
public class EnquireLink extends SMPPPacket {
    private static final long serialVersionUID = 2L;

    /**
     * Construct a new EnquireLink.
     */
    public EnquireLink() {
        super(CommandId.ENQUIRE_LINK);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() * 47;
    }
}

