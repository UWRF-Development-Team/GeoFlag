package org.falcon.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.falcon.entity.leaderboard.LeaderboardEntry;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String username;
    @Embedded
    private Rank rank;
    @Column()
    private int score;
    @ManyToMany
    @JoinTable(name = "user_leaderboard",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "leaderboard_entry_id"))
    private List<LeaderboardEntry> leaderboardEntries;
    public User() {
        this.username = "";
        this.rank = new Rank();
        this.score = 0;
        this.leaderboardEntries = new ArrayList<>();
    }
    public User(String username, Rank rank, int score) {
        this.username = username;
        this.rank = rank;
        this.score = score;
        this.leaderboardEntries = new ArrayList<>();
    }
    @Override
    public int hashCode() {
        if (this.id != null) {
            return this.id.hashCode();
        } else {
            return super.hashCode();
        }
    }
}

