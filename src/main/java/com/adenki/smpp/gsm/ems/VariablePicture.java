package com.adenki.smpp.gsm.ems;

import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;

/**
 * Implementation of a variable picture. See 3GPP TS 23.040 9.2.3.24.10.1.9.
 * @version $Id: VariablePicture.java 484 2010-02-08 16:08:50Z orank $
 */
public class VariablePicture extends Picture {

    public VariablePicture(BufferedImage image, int position) {
        super(0x12, image, position);
    }

    public VariablePicture(BufferedImage image) {
        super(0x12, image);
    }

    
    @Override
    protected int getExtraHeaderSize() {
        return 2;
    }

    @Override
    protected void writeHeader(BufferedImage image, ByteBuffer buffer) {
        int width = image.getWidth();
        buffer.put((byte) (width / 8));
        buffer.put((byte) image.getHeight());
    }

    @Override
    protected void checkImage(BufferedImage image) {
        int width = image.getWidth();
        if (width % 8 != 0) {
            throw new IllegalArgumentException(
                    "Image width must be a multiple of 8");
        }
    }

}
