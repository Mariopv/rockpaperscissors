import * as React from 'react'
import {Button} from "./button/button";
import {GameTable} from "./gameTable/gameTable";

export default class GameBoard extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            localRoundsCounter:0,
            rounds:[]
        }
    }

    restartGame() {
        this.setState({
            localRoundsCounter:0,
            rounds:[]
        })
    }

    async playRound() {
        try {
            const response = await fetch('api/play/round');
            if (!response.ok) {
                throw Error(response);
            }
            const data = await response.json();
            const incremLocalRoundsCounter = this.state.localRoundsCounter + 1;
            this.setState({localRoundsCounter: incremLocalRoundsCounter});
            const rounds = this.state.rounds.slice();
            rounds.push(data);
            this.setState({rounds: rounds})
        } catch (error) {
            this.handleApiError(error)
        }
    }

    handleApiError(error) {
        console.log(error.message);
    }

    render() {
        const roundsCounter = this.state.localRoundsCounter;
        const playedRounds = "Played rounds: " + roundsCounter;
        const rounds = this.state.rounds;
        const playRoundBtnLabel = "Play Round"
        const resetGameBtnLabel = "Restart Game"

        return (
            <div className="game-board">
                <div className="game-controls">
                    <Button className="button" onClick={() => this.playRound()}>{playRoundBtnLabel}</Button>
                    <Button className="button" onClick={() => this.restartGame()}>{resetGameBtnLabel}</Button>
                    <div>{playedRounds}</div>
                </div>
                <div className="game-table"><GameTable rounds={rounds}/></div>
            </div>
        )
    }

}
