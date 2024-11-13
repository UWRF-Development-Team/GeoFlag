package org.falcon.models.guess;

public interface GeoLocatable {
    boolean matches(GeoLocatable comparedLocation);
}
