package org.ciklum.rockpaperscissors.backendapi.service;

import org.ciklum.rockpaperscissors.backendapi.model.GameResults;
import org.ciklum.rockpaperscissors.backendapi.model.RoundDto;
import org.springframework.stereotype.Service;

@Service
public class StatisticsService {


    private int totalRounds;
    private int totalFirstWin;
    private int totalSecondWin;
    private int totalDraw;

    public StatisticsService() {
        this.totalRounds = 0;
        this.totalFirstWin = 0;
        this.totalSecondWin = 0;
        this.totalDraw = 0;
    }

    public int getTotalRounds() {
        return totalRounds;
    }

    public int getTotalFirstWin() {
        return totalFirstWin;
    }

    public int getTotalSecondWin() {
        return totalSecondWin;
    }

    public int getTotalDraw() {
        return totalDraw;
    }

    public void updateStatistics(RoundDto roundDto) {
        totalRounds+=1;

    }
}
