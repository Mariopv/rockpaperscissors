import * as React from 'react'

function GameTableRow(props){
    const {round} = props
    if(!round) {
        return <tr/>
    }
    return (
        <tr>
            <td className="column1">{round.first_player}</td>
            <td className="column2">{round.second_player}</td>
            <td className="column3">{round.game_result}</td>
        </tr>
    );
}

export { GameTableRow }