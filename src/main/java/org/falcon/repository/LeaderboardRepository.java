package org.falcon.repository;

import org.falcon.entity.leaderboard.Leaderboard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface LeaderboardRepository extends CrudRepository<Leaderboard, Long> {
    Page<Leaderboard> findAll(Pageable pageable);
}
