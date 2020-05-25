package org.ciklum.rockpaperscissors.backendapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RoundDto {

    private GameOptions firstPlayer;
    private GameOptions secondPlayer;
    private GameResults gameResult;

    public RoundDto(final GameOptions firstPlayer, final GameOptions secondPlayer, final GameResults gameResult) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.gameResult = gameResult;
    }

    public GameOptions getFirstPlayer() {
        return firstPlayer;
    }

    public GameOptions getSecondPlayer() {
        return secondPlayer;
    }

    public GameResults getGameResult() {
        return gameResult;
    }

 }
