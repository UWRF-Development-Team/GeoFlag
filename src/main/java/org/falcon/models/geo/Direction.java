package org.falcon.models.geo;

public enum Direction {
    NORTH('N'),
    EAST('E'),
    SOUTH('S'),
    WEST('W');
    public final char direction;
    Direction(char direction) {
        this.direction = direction;
    }
}
