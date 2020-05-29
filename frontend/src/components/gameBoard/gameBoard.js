import * as React from 'react'

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
    }

}
