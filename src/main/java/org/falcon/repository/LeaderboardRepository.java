package org.falcon.repository;

import org.falcon.entity.leaderboard.Leaderboard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderboardRepository extends JpaRepository<Leaderboard, Long> {
    Page<Leaderboard> findAll(Pageable pageable);
}
