import * as React from 'react'

export default class GameStatistics extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            statistics:[]
        }
    }

    setStatistics(statistics) {
        this.setState({
            statistics:statistics
        })
    }

    render() {
        const statistics = this.state.statistics;
        const statsRounds = statistics[0];
        const statsFirstWon = statistics[1];
        const statsSecondWon = statistics[2];
        const statsDraw = statistics[3];
        return(
            <div className="game-statistics">
                <div className="stats-header">Global Statistics Info</div>
                <div className="totalRounds">Total played rounds:  {statsRounds}</div>
                <div className="totalFirst">Total 1st player won: {statsFirstWon}</div>
                <div className="totalSecond">Total 2nd player won: {statsSecondWon}</div>
                <div className="totalDraw">Total draw rounds:    {statsDraw}</div>
            </div>
        )
    }
}