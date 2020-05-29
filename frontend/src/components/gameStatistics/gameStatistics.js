import * as React from 'react'

export default class GameStatistics extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            statistics:[]
        }
    }
    render() {
        return(
            <div className="game-statistics">
            </div>
        )
    }
}