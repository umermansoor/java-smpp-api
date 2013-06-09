package com.adenki.smpp.util;

/**
 * An object that implements {@link APIConfig} but does nothing.
 * @version $Id: NullAPIConfig.java 475 2009-07-12 17:30:47Z orank $
 */
public class NullAPIConfig extends AbstractAPIConfig implements APIConfig {

    public String getProperty(String property) throws PropertyNotFoundException {
        throw new PropertyNotFoundException();
    }

    public void initialise() {
    }

    public boolean reloadAPIConfig() {
        return false;
    }
}
