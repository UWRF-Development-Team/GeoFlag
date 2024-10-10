package org.falcon.models.identifier;
import org.falcon.models.geo.Continent;
import org.falcon.models.geo.Coord;
import org.falcon.models.geoIdentifier.*;

import java.util.Optional;
import java.util.TimeZone;

public class Identifier {
    Optional<Continent> continent;
    Optional<Coord> coordinates;
    Optional<Animal> animal;
    Optional<Capital> capital;
    Optional<Crest> crest;
    Optional<Flag> flag;
    Optional<Island> island;
    Optional<Landmarks> landmarks;
    Optional<Name> name;
    Optional<TimeZone> timeZone;
    Optional<City> city;
    Optional<Country> country;
    Optional<District> district;
    Optional<Province> province;
    Optional<State> state;
    Optional<Territory> territory;
    Optional<Population> population;
    public Identifier(Continent continent, Coordinates coordinates, Animal animal, Capital capital, Crest crest, Flag flag,
                      Island island, Landmarks landmarks, Name name, TimeZone timezone) {
        this.continent = Optional.of(continent);
        this.coordinates = Optional.of(coord);
        this.animal = Optional.of(animal);
        this.capital = Optional.of(capital);
        this.crest = Optional.of(crest);
        this.flag = Optional.of(flag);
        this.island = Optional.of(island);
        this.landmarks = Optional.of(landmarks);
        this.name = Optional.of(name);
        this.timeZone = Optional.of(timezone);
        this.city = Optional.of(city);
        this.country = Optional.of(country);
        this.district = Optional.of(district);
        this.province = Optional.of(province);
        this.state = Optional.of(state);
        this.territory = Optional.of(district);
        this.population = Optional.of(population);

    }
    public Identifier() {
        this.continent = Optional.empty();
        this.coordinates = Optional.empty();
        this.animal = Optional.empty();
        this.capital = Optional.empty();
        this.crest = Optional.empty();
        this.flag = Optional.empty();
        this.island = Optional.empty();
        this.landmarks= Optional.empty();
        this.name = Optional.empty();
        this.timeZone = Optional.empty();
        this.city = Optional.empty();
        this.country = Optional.empty();
        this.district = Optional.empty();
        this.province = Optional.empty();
        this.state = Optional.empty();
        this.territory = Optional.empty();
        this.population = Optional.empty();
    }
        //typically the comment goes here.
    public boolean identify(Identifiable itemToIdentify) {
        
        //
        

        return true;
    }





//    public boolean hasContinent() {
//        return this.continent.isPresent();
//    }

}


