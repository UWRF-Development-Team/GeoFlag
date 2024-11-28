package org.falcon.models.identifier;
import org.falcon.models.geo.Continent;
import org.falcon.models.geo.Coord;
import org.falcon.models.geoIdentifier.*;
import org.falcon.models.guess.GeoLocatable;

import java.util.Optional;
import java.util.TimeZone;

public class Identifier implements Identifiable {
    @Override
    public boolean matches(GeoLocatable geoLocatable) {
        return false;
    }
    //call a database with the type of identifier used

    //compare the name of the identifiable from the database with the name of the identifiable we're trying to match

    //if they are equal return true
//    public boolean hasContinent() {
//        return this.continent.isPresent();
//    }

}


