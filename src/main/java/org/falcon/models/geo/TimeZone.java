package org.falcon.models.geo;

public enum TimeZone {
    CST("Central Standard Time"),
    EST("Eastern Standard Time"),
    MST("Mountain Standard Time"),
    PST("Pacific Standard Time"),
    UST("Universal Standard Time");
    public final String timeZone;
    TimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}
