package org.falcon.models.geoIdentifier;

import org.falcon.models.geo.*;
import org.falcon.models.geoIdentifier.attributes.Name;

import java.util.Optional;

public class GeoIdentifier {
//    private Optional<Country> country;
//    private Optional<City> city;
//    private Optional<Capital> capital;
//    private Optional<TimeZone> timezone;
//
//    public GeoIdentifier() {
//        this.country = Optional.empty();
//        this.city = Optional.empty();
//        this.capital = Optional.empty();
//        this.timezone = Optional.empty();
//
//    }
//    public GeoIdentifier(Country country,
//                        City city, Capital capital,
//                        TimeZone timezone) {
//        this.country = Optional.of(country);
//        this.city = Optional.of(city);
//        this.capital = Optional.of(capital);
//        this.timezone = Optional.of(timezone);
//
//
//    }
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
}
