package org.falcon.models.geo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TimeZones extends Geographical {
    protected Area area;
    protected String abbrev;
    public TimeZones() {
        this.area = new Area();
        this.abbrev = "";
    }
    public TimeZones(Area area, String abbrev) {
        this.area = area;
        this.abbrev = abbrev;
    }
}
