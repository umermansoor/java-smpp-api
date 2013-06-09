package com.adenki.smpp.gsm.ems;

import java.nio.ByteBuffer;

import com.adenki.smpp.gsm.AbstractHeaderElement;

/**
 * Implementation of the user prompt indicator.
 * @version $Id: UserPromptIndicator.java 484 2010-02-08 16:08:50Z orank $
 */
public class UserPromptIndicator extends AbstractHeaderElement {

    private int numObjects;
    
    public UserPromptIndicator(int numObjects) {
        this.numObjects = numObjects;
    }
    
    @Override
    protected boolean doWrite(int segmentNum, ByteBuffer buffer) {
        buffer.put((byte) 0x13);
        buffer.put((byte) 1);
        buffer.put((byte) numObjects);
        return true;
    }
    
    public int getLength() {
        return 1;
    }
}
