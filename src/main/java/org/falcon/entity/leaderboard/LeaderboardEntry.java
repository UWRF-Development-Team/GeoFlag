package org.falcon.entity.leaderboard;

import jakarta.persistence.*;
import org.falcon.entity.user.User;

import java.util.ArrayList;
import java.util.List;

@Table(
        name = "leaderboard_entries",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"leaderboard_id", "rank"})
        }
)
@Entity
public class LeaderboardEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leaderboard_entry_id")
    private Long id;
    @Column(name = "rank")
    private int rank;
    @ManyToOne
    @JoinColumn(name = "leaderboard_id", nullable = false)
    private Leaderboard leaderboard;
    @ManyToMany(mappedBy = "leaderboardEntries")
    private List<User> users;
    public LeaderboardEntry() {
        this.rank = 0;
        this.users = new ArrayList<>();
    }
    public LeaderboardEntry(int rank, List<User> users) {
        this.rank = rank;
        this.users = users;
    }
}
