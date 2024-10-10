package org.falcon.models.geoIdentifier;

import org.falcon.models.geo.CoordRange;
import org.falcon.models.geo.TimeZones;
import org.falcon.models.geoIdentifier.attributes.Name;

public class Territory extends GeoIdentifier {
    public Territory() {
        super();
    }

    public Territory(Name name, CoordRange coordRange,
                     TimeZones timeZones) {
        super(name, coordRange, timeZones);
    }
}
