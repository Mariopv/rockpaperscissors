package ciklum.rockpaperscissors.backendapi.service;

import ciklum.rockpaperscissors.backendapi.model.GameOptions;
import ciklum.rockpaperscissors.backendapi.model.GameResults;
import ciklum.rockpaperscissors.backendapi.model.RoundDto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StatisticsServiceTest {

    StatisticsService statisticsService;

    @Mock
    WebSocketService webSocketService;

    @Before
    public void setup(){
        statisticsService = new StatisticsService(webSocketService);
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
