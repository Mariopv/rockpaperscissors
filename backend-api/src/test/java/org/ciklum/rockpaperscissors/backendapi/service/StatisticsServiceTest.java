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

}
