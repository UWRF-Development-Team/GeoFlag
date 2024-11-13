package org.falcon.comms.response;

import lombok.Getter;
import lombok.Setter;
import org.falcon.models.guess.Guess;

@Getter
@Setter
public class GuessResponse {
    private boolean matches;
    public GuessResponse(boolean matches) {
        this.matches = matches;
    }
    public static GuessResponse from(Guess guess) {
        return new GuessResponse(guess.isMatches());
    }
}
