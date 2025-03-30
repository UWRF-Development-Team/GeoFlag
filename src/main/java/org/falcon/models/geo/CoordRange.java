package org.falcon.models.geo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoordRange {
    private Coord from;
    private Coord to;
    public CoordRange() {
        this.from = new Coord();
        this.to = new Coord();
    }
    public CoordRange(Coord from, Coord to) {
        this.from = from;
        this.to = to;
    }
}
