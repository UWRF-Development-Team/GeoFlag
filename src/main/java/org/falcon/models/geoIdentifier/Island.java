package org.falcon.models.geoIdentifier;

import org.falcon.models.geo.CoordRange;
import org.falcon.models.geo.TimeZones;
import org.falcon.models.geoIdentifier.attributes.Name;

public class Island extends GeoIdentifier{
    public Island() {
        super();
    }
    public Island(Name name,
                   CoordRange coordRange,
                   TimeZones timeZones) {
        super(name, coordRange, timeZones);
    }
}
