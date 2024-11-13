package org.falcon.models.identifier;

import org.falcon.models.guess.GeoLocatable;

public interface Identifiable {
    boolean matches(GeoLocatable geoLocatable);
}
