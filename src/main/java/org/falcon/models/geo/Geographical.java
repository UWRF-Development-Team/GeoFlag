package org.falcon.models.geo;
import lombok.Getter;
import lombok.Setter;

import org.falcon.models.geoIdentifier.attributes.Name;

import java.util.Optional;
@Getter
@Setter
public class Geographical {
    //private Capital capital;
    //private Coordinates coordinates;
    //private Province province;
    //private State state;
    //private Country country;
    //private Territory territory;
    //private District district;
    //private Continent continent;
    private Optional<Coord> coord;
    private Optional<Area> area;
    private Optional<CoordRange> coordRange;
    private Optional<Continent> continent;
    private Optional<Name> name;
    private Optional<TimeZones> timeZones;

    public Geographical() {
        this.coord = Optional.empty();
        this.area = Optional.empty();
        this.coordRange = Optional.empty();
        this.continent = Optional.empty();
        this.name = Optional.empty();
        this.timeZones = Optional.empty();
    }
    public Geographical(Coord coord,
                        Area area, CoordRange coordRange,
                        Continent continent, Name name,TimeZones timezone) {
        this.coord = Optional.of(coord);
        this.area = Optional.of(area);
        this.coordRange = Optional.of(coordRange);
        this.continent = Optional.of(continent);
        this.name = Optional.of(name);
        this.timeZones = Optional.of(timezone);

    }



//    boolean matchWithName(String name){
//    }
//    boolean matchWithState(State state){
//    }

}