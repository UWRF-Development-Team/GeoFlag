package org.falcon.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.falcon.entity.leaderboard.LeaderboardEntry;

@Getter
@Setter
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String username;
    @Embedded
    private Rank rank;
    @Column()
    private int score;
    @JoinColumn(name = "leaderboard_entry_id")
    @ManyToOne(cascade = CascadeType.ALL)
    LeaderboardEntry leaderboardEntry;
    public User() {

    }
    public User(String username, Rank rank, int score) {
        this.username = username;
        this.rank = rank;
        this.score = score;
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

