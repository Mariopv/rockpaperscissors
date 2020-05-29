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

    render() {
    }

}
