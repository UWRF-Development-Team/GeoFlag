package org.falcon.models.geo;
import lombok.Getter;
import lombok.Setter;

import org.falcon.models.geoIdentifier.attributes.Name;
import org.falcon.models.guess.GeoLocatable;

import java.util.Optional;
@Getter
@Setter
public class Geographical implements GeoLocatable {
    //private Capital capital;
    //private Coordinates coordinates;
    //private Province province;
    //private State state;
    //private Country country;
    //private Territory territory;
    //private District district;
    //private Continent continent;
    private Coord coord;
    private Area area;
    private CoordRange coordRange;
    private Continent continent;
    private Name name;
    private TimeZones timeZones;

    public Geographical() {
        this.coord = new Coord();
        this.area = new Area();
        this.coordRange = new CoordRange();
        this.continent = new Continent();
        this.name = new Name();
        this.timeZones = new TimeZones();
    }
    public Geographical(Coord coord,
                        Area area, CoordRange coordRange,
                        Continent continent, Name name,
                        TimeZones timezone) {
        this.coord = coord;
        this.area = area;
        this.coordRange = coordRange;
        this.continent = continent;
        this.name = name;
        this.timeZones = timezone;

    }
    @Override
    public boolean equals(Object comparedObject) {
        if (comparedObject instanceof Name comparedName) {
            return this.name.equals(comparedName);
        }
        return false;
    }

    @Override
    public boolean matches(GeoLocatable comparedGeo) {
        return this.equals(comparedGeo);
    }



//    boolean matchWithName(String name){
//    }
//    boolean matchWithState(State state){
//    }

}