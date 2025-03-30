package org.falcon;

import org.falcon.models.geo.*;
import org.falcon.models.geoIdentifier.Country;
import org.falcon.models.geoIdentifier.attributes.Name;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountryTest {
    List<TimeZone> timeZonesList = List.of(
            TimeZone.CST,
            TimeZone.EST,
            TimeZone.PST,
            TimeZone.MST
    );
    Point toLong = new Point(67, Direction.WEST);
    Point toLat = new Point(26, Direction.NORTH);
    Coord to = new Coord(toLat, toLong);

    Point fromLong = new Point(125, Direction.WEST);
    Point fromLat = new Point(49, Direction.NORTH);
    Coord from = new Coord(fromLat, fromLong);

    CoordRange coordRange = new CoordRange(from, to);

    TimeZones timeZones = new TimeZones(timeZonesList);
    Country testCountry = new Country(
            new Name("United States"),
            coordRange,
            timeZones
    );
    @Test
    public void testExists() {
        boolean exists = testCountry != null;
        assertTrue(exists);
    }
    @Test
    public void testTimeZonesExists() {
        boolean exists = testTimeZones != null;
        assertTrue(exists);
    }

}
