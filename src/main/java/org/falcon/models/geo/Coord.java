package org.falcon.models.geo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coord extends Geographical {
    protected double longitude;
    protected double latitude;
}
