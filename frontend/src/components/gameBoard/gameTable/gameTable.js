import * as React from 'react'
import {GameTableRow} from "../gameTableRow/gameTableRow";

class GameTable extends React.Component {
    render() {
        const rounds = this.props.rounds;
        const rows = [];
        if(!rounds) {
            return <table/>
        }
        rounds.forEach((round,index) => {
            rows.push(
                <GameTableRow key={index} round={round}/>);
        });
        return (
            <table className="table">
                <thead>
                <tr>
                    <th className="column1">First Player</th>
                    <th className="column2">Second Player</th>
                    <th className="column3">Result</th>
                </tr>
                </thead>
                <tbody>{rows}</tbody>
            </table>
        );
    }
}

export { GameTable }