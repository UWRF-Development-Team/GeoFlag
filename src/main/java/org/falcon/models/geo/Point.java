package org.falcon.models.geo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point {
    private double coordValue;
    private Direction direction;
    public Point() {
        this.coordValue = 0;
        this.direction = Direction.NORTH;
    }
    public Point(double coordValue, Direction direction) {
        this.coordValue = coordValue;
        this.direction = direction;
    }
}
