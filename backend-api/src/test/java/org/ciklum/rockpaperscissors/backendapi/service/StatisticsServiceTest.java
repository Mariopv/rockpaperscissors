package org.ciklum.rockpaperscissors.backendapi.service;

import org.ciklum.rockpaperscissors.backendapi.model.GameOptions;
import org.ciklum.rockpaperscissors.backendapi.model.GameResults;
import org.ciklum.rockpaperscissors.backendapi.model.RoundDto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StatisticsServiceTest {

    StatisticsService statisticsService;

    @Before
    public void setup(){
        statisticsService = new StatisticsService();
    }

    @Test
    public void shouldIncrementTotalRounds_WhenUpdateStatistics() {
        RoundDto roundDto = new RoundDto(GameOptions.ROCK,GameOptions.ROCK, GameResults.DRAW);
        this.statisticsService.updateStatistics(roundDto);

        Assert.assertEquals(this.statisticsService.getTotalRounds(),1);
    }

    @Test
    public void shouldIncrementTotalFirstWin_WhenUpdateStatistics() {
        RoundDto roundDto = new RoundDto(GameOptions.ROCK,GameOptions.SCISSORS, GameResults.FIRST_PLAYER_WIN);
        this.statisticsService.updateStatistics(roundDto);

        Assert.assertEquals(this.statisticsService.getTotalFirstWin(),1);
    }

    @Test
    public void shouldIncrementTotalSecondWin_WhenUpdateStatistics() {
        RoundDto roundDto = new RoundDto(GameOptions.ROCK,GameOptions.PAPER, GameResults.SECOND_PLAYER_WIN);
        this.statisticsService.updateStatistics(roundDto);

        Assert.assertEquals(this.statisticsService.getTotalSecondWin(),1);
    }

    @Test
    public void shouldIncrementTotalDraw_WhenUpdateStatistics() {
        RoundDto roundDto = new RoundDto(GameOptions.ROCK,GameOptions.ROCK, GameResults.DRAW);
        this.statisticsService.updateStatistics(roundDto);

        Assert.assertEquals(this.statisticsService.getTotalDraw(),1);
    }
}
