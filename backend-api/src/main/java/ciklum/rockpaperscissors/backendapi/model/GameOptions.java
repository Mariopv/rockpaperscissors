package ciklum.rockpaperscissors.backendapi.model;

public enum GameOptions {
    PAPER,
    ROCK,
    SCISSORS;

    public static GameOptions getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
