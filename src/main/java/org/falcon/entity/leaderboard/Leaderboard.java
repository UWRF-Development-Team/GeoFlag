package org.falcon.entity.leaderboard;
import java.util.ArrayList;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.falcon.entity.user.Rank;
import org.falcon.entity.user.User;
import java.util.HashMap;
import java.util.Map;

/** Idk. Kinda confused here ngl */
@Getter
@Setter
@Entity
@Table
public class Leaderboard {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  //We can also go another route with this, I'm open to suggestions
  @Column(unique = true, nullable = false)
  private String username;

  @Embedded
  private Rank rank;

  // Merge this with already created functions
  //private Map<Integer, User> Leaderboard = new HashMap<>();
  public void adduser (User user){
    // Before we insert, we need to check the rank with the other ranks

  }
}
