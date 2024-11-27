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

@Getter
@Setter
@Entity
@Table(name = "leaderboard")
public class Leaderboard {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "leaderboard_id")
  private Long id;
  @OneToMany(mappedBy = "leaderboard", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<LeaderboardEntry> leaderboardEntries;
  public Leaderboard() {
    this.leaderboardEntries = new ArrayList<>();
  }
  public Leaderboard(List<LeaderboardEntry> leaderboard) {
    this.leaderboardEntries = leaderboard;
  }
  public void adduser (User user){
    // Before we insert, we need to check the rank with the other ranks

  }
}
