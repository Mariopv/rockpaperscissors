import React from 'react'
import './../../config/setupEnzyme'
import './../../config/setupJest'
import {shallow} from 'enzyme';
import GameBoard from './gameBoard'

describe('<GameBoard /> tests', () => {

    it("should restart game", () => {
        // Arrange
        const component = shallow(<GameBoard/>);
        component.setState({
            localRoundsCounter: 1,
            rounds: [{
                first_player: "ROCK",
                second_player: 'ROCK',
                game_result: 'DRAW'
            }]
        });

        // Act
        component.instance().restartGame();

        // Asert
        expect(component.state('localRoundsCounter')).toEqual(0);
        expect(component.state('rounds').length).toEqual(0);
    })

})

