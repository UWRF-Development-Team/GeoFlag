package org.falcon.models.geoIdentifier;

import org.falcon.models.geo.CoordRange;
import org.falcon.models.geo.TimeZones;
import org.falcon.models.geoIdentifier.attributes.Name;

public class Province extends GeoIdentifier{
    public Province() {
        super();
    }
    public Province(Name name,
                    CoordRange coordRange,
                    TimeZones timeZones) {
        super(name, coordRange, timeZones);
    }
}
