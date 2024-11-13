package org.falcon.models.guess;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Guess {
    private boolean matches;
    private GeoLocatable locationGuess;
    private GeoLocatable actualLocation;

    public Guess() {
        this.matches = false;
        this.locationGuess = null;
        this.actualLocation = null;
    }
    public Guess(GeoLocatable locationGuess,
                 GeoLocatable actualLocation) {
        this.locationGuess = locationGuess;
        this.actualLocation = actualLocation;
        this.matches = this.doesMatch();
    }
    // Call this.matches = this.doesMatch()
    public boolean doesMatch() {
        return this.locationGuess.matches(this.actualLocation);
    }
}
// Takes identifiable