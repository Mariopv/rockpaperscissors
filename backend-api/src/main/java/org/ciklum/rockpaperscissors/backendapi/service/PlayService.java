package org.ciklum.rockpaperscissors.backendapi.service;

import org.ciklum.rockpaperscissors.backendapi.model.RoundDto;
import org.ciklum.rockpaperscissors.backendapi.model.GameResults;
import org.ciklum.rockpaperscissors.backendapi.model.GameOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayService {

    private final StatisticsService statisticsService;

    private final GameOptions firstPlayerOption = GameOptions.ROCK;

    /**
     * Arg Constructor.
     *
     * @param statisticsService the {@link StatisticsService} to set.
     */
    @Autowired
    public PlayService(final StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    public RoundDto getRound() {
        RoundDto roundDto = playRound();
        this.statisticsService.updateStatistics(roundDto);
        return roundDto;
    }

    RoundDto playRound() {
        GameOptions secondPlayerOption = GameOptions.getRandom();
        GameResults gameResult = calculateResult(secondPlayerOption);
        return new RoundDto(firstPlayerOption,secondPlayerOption,gameResult);
    }

    GameResults calculateResult(GameOptions secondPlayerOption) {
        if (secondPlayerOption.equals(GameOptions.ROCK)) {
            return GameResults.DRAW;
        } else if (secondPlayerOption.equals(GameOptions.SCISSORS)) {
            return GameResults.FIRST_PLAYER_WIN;
        } else {
            return GameResults.SECOND_PLAYER_WIN;
        }
    }
}
