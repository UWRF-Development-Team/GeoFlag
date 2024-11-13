package org.falcon.models.geoIdentifier;

import org.falcon.models.geo.*;
import org.falcon.models.geoIdentifier.attributes.Name;
import org.falcon.models.guess.GeoLocatable;

public class GeoIdentifier implements GeoLocatable {
    protected Name name;
    protected CoordRange coordRange;
    protected TimeZones timeZones;
    public GeoIdentifier() {
        this.name = new Name();
        this.coordRange = new CoordRange();
        this.timeZones = new TimeZones();
    }
    public GeoIdentifier(Name name,
                         CoordRange coordRange,
                         TimeZones timeZones) {
        this.name = name;
        this.coordRange = coordRange;
        this.timeZones = timeZones;
    }
    @Override
    public boolean equals(Object comparedObject) {
        if (comparedObject instanceof Name comparedName) {
            return this.name.equals(comparedName);
        }
        return false;
    }

    @Override
    public boolean matches(GeoLocatable comparedGeo) {
        return this.equals(comparedGeo);
    }
}
