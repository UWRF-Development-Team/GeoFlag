package org.falcon.entity.leaderboard;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.falcon.entity.user.Rank;
import org.falcon.entity.user.User;

import java.util.HashMap;
import java.util.Map;


@Getter
@Setter
public class Leaderboard {

    private Map<Integer, List<User>> leaderboard;
    @Id
    int placement;


    public Leaderboard() {
        this.leaderboard = new HashMap<>();
    }

    public Leaderboard(Map<Integer, List<User>> Leaderboard) {
        this.leaderboard = Leaderboard;
    }


    public void adduser(User user) {
        // check to see if there are multiple users with the same score
        List<User> userRanks = this.leaderboard.get(user.getScore());
        userRanks.add(user);
        this.leaderboard.put(user.getScore(), userRanks);
    }

    public Rank getPlacement(User user) {
        Rank placementValue = new Rank();
        // Check the score
        int user_score = user.getScore();
        // Find placement amongst everyone else

        if (leaderboard.containsKey(user_score)) {
            leaderboard.get(user_score).forEach((entry) -> {
                if (entry.getId().equals(user.getId())) {
                    placementValue = entry.getRank();
                }});
        }

        // Return their correct placement based on score
       return placementValue;
    }
}
