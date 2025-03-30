package org.falcon.models.geo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coord {
    protected Point longitude;
    protected Point latitude;
    public Coord() {
        this.longitude = new Point();
        this.latitude = new Point();
    }
    public Coord(Point longitude, Point latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
