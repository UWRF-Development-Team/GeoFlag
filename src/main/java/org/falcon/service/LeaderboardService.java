package org.falcon.service;

import org.falcon.entity.leaderboard.Leaderboard;
import org.falcon.repository.LeaderboardRepository;
import org.falcon.repository.UserRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

import java.util.List;

@Service
public class LeaderboardService {
    public LeaderboardService() {}

    LeaderboardRepository leaderboardRepository;

    public List<Leaderboard> getTopTenRankings() {
        List<Leaderboard> topTenRankings = new ArrayList<Leaderboard>();
        this.leaderboardRepository.findAll(PageRequest.of(0, 10, Sort.by(Sort.Order.asc("rank"))))
                .stream().forEach(topTenRankings::add);
        return topTenRankings;
    }
}
