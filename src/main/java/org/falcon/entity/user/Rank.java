package org.falcon.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Rank {
    @Column(name = "rank_placement")
    private int rankPlacement;
}
