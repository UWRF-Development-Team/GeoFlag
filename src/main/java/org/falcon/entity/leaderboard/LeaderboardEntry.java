package org.falcon.entity.leaderboard;

import jakarta.persistence.*;
import org.falcon.entity.user.User;

import java.util.ArrayList;
import java.util.List;

@Table(name = "leaderboard_entries")
@Entity
public class LeaderboardEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "leaderboard_entry_id")
    private Long id;
    @JoinColumn(name = "leaderboard_id")
    @OneToMany(mappedBy = "leaderboardEntry", cascade = CascadeType.ALL)
    List<User> users;
    public LeaderboardEntry() {
        this.users = new ArrayList<>();
    }
    public LeaderboardEntry(List<User> users) {
        this.users = users;
    }
}
