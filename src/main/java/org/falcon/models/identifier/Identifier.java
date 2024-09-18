package org.falcon.models.identifier;
import java.util.Optional;
import java.util.TimeZone;

import org.falcon.models.Continent;
import org.falcon.models.Coordinates;
import org.falcon.models.identifier.Animal;
import org.falcon.models.identifier.Capital;
import org.falcon.models.identifier.Crest;
import org.falcon.models.identifier.Flag;
import org.falcon.models.identifier.Island;
import org.falcon.models.identifier.Landmarks;
import org.falcon.models.identifier.Name;

public class Identifier {
    Optional<Continent> continent;
    Optional<Coordinates> coordinates;
    Optional<Animal> animal;
    Optional<Capital> capital;
    Optional<Crest> crest;
    Optional<Flag> flag;
    Optional<Island> island;
    Optional<Landmarks> landmarks;
    Optional<Name> name;
    Optional<TimeZone> timeZone;
    //typically the comment goes here.
    public boolean identify(Identifiable itemToIdentify) {
        
        //
        

        return true;
    }





//    public boolean hasContinent() {
//        return this.continent.isPresent();
//    }

}