package com.adenki.smpp.gsm.ems;

import java.awt.image.BufferedImage;

/**
 * Implementation of a variable picture. See 3GPP TS 23.040 9.2.3.24.10.1.9.
 * @version $Id: SmallPicture.java 484 2010-02-08 16:08:50Z orank $
 */
public class SmallPicture extends Picture {

    public SmallPicture(BufferedImage image, int position) {
        super(0x11, image, position);
    }

    public SmallPicture(BufferedImage image) {
        super(0x11, image);
    }

    @Override
    protected void checkImage(BufferedImage image) {
        if (image.getWidth() != 16 || image.getHeight() != 16) {
            throw new IllegalArgumentException("Image must be exactly 16x16");
        }
    }
}
