package org.falcon.entity.leaderboard;
import java.util.ArrayList;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.falcon.entity.user.Rank;
import org.falcon.entity.user.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Idk. Kinda confused here ngl */
@Getter
@Setter
@Entity
@Table(name = "leaderboard")
public class Leaderboard {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @OneToMany(mappedBy = "leaderboard", cascade = CascadeType.ALL)
  private Map<Integer, LeaderboardEntry> leaderboard;
  public Leaderboard() {
    this.leaderboard = new HashMap<>();
  }
  public Leaderboard(Map<Integer, LeaderboardEntry> leaderboard) {
    this.leaderboard = leaderboard;
  }
  public void adduser (User user){
    // Before we insert, we need to check the rank with the other ranks

  }
}
