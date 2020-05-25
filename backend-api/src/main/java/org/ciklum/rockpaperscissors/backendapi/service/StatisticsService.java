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

    public int getTotalSecondWin() { return totalSecondWin; }

    public int getTotalDraw() {
        return totalDraw;
    }

    public void updateStatistics(RoundDto roundDto) {
        totalRounds+=1;
        if (roundDto.getGameResult().equals(GameResults.FIRST_PLAYER_WIN)) {
            totalFirstWin+=1;
        } else if (roundDto.getGameResult().equals(GameResults.SECOND_PLAYER_WIN)) {
            totalSecondWin+=1;
        } else {
            totalDraw+=1;
        }
    }

}
