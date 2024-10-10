package org.falcon.models.geoIdentifier;

import org.falcon.models.geo.CoordRange;
import org.falcon.models.geo.TimeZones;
import org.falcon.models.geoIdentifier.attributes.Name;

public class City extends GeoIdentifier {
    public City() {
        super();
    }
    public City(Name name,
                   CoordRange coordRange,
                   TimeZones timeZones) {
        super(name, coordRange, timeZones);
    }
}
