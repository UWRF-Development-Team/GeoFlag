package org.falcon.models.geo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TimeZones {
    protected List<TimeZone> timeZones;
    public TimeZones() {
        this.timeZones = new ArrayList<>();
    }
    public TimeZones(List<TimeZone> timeZones) {
        this.timeZones = timeZones;
    }
}
