package org.falcon.entity.leaderboard;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
import org.falcon.entity.user.User;
import java.util.HashMap;
import java.util.Map;


@Getter
@Setter
public class Leaderboard {
  // Do we want a leaderboard for every day? That could be the ID?
  private Map<Integer, User> Leaderboard = new HashMap<>();
  public void adduser (User user){
    // Before we insert, we need to check the rank with the other ranks

  }
}
