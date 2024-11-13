package org.falcon.comms.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewUserScoreRequest {
    private String username;
    private int score;

    public NewUserScoreRequest() {}
}
