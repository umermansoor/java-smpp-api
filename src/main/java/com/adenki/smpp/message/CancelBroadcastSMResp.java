package com.adenki.smpp.message;

/**
 * Cancel broadcast message response.
 * @version $Id: CancelBroadcastSMResp.java 452 2009-01-15 16:56:36Z orank $
 * @since 0.4.0
 */
public class CancelBroadcastSMResp extends SMPPPacket {
    private static final long serialVersionUID = 2L;

    public CancelBroadcastSMResp() {
        super (CommandId.CANCEL_BROADCAST_SM_RESP);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() * 13;
    }
}
