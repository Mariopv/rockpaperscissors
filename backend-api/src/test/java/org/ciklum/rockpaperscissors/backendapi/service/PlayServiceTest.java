package org.ciklum.rockpaperscissors.backendapi.service;


import org.ciklum.rockpaperscissors.backendapi.model.GameOptions;
import org.ciklum.rockpaperscissors.backendapi.model.GameResults;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PlayServiceTest {

    @Mock
    StatisticsService statisticsService;

    PlayService playService;

    @Before
    public void setup(){
        playService = new PlayService(statisticsService);
    }

    @Test
    public void shouldReturnDraw_WhenSecondPlayerGamesRock() {
        GameOptions secondPlayerOption = GameOptions.ROCK;
        Assert.assertEquals(GameResults.DRAW,playService.calculateResult(secondPlayerOption));
    }

    @Test
    public void shouldReturnFirstUserWin_WhenSecondPlayerGamesScissors() {
        GameOptions secondPlayerOption = GameOptions.SCISSORS;
        Assert.assertEquals(GameResults.FIRST_PLAYER_WIN,playService.calculateResult(secondPlayerOption));
    }

    @Test
    public void shouldReturnSecondUserWin_WhenSecondPlayerGamesPaper() {
        GameOptions secondPlayerOption = GameOptions.PAPER;
        Assert.assertEquals(GameResults.SECOND_PLAYER_WIN,playService.calculateResult(secondPlayerOption));
    }

}
