package com.adenki.smpp.version;

/**
 * Enumeration of mandatory parameters. This enumeration is used to get
 * the maximum field lengths of mandatory parameters from an
 * {@link com.adenki.smpp.version.SMPPVersion}.
 * @version $Id: MandatoryParameter.java 452 2009-01-15 16:56:36Z orank $
 * @see com.adenki.smpp.version.SMPPVersion#getMaxLength(MandatoryParameter)
 */
public enum MandatoryParameter {
    SHORT_MESSAGE,
}
