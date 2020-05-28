import React from 'react'
import renderer from 'react-test-renderer'
import {GameTableRow} from "./gameTableRow"

describe('<GameTableRow /> tests', () => {

    it("should render an empty row", () => {
        // Act
        const tree = renderer.create(<GameTableRow />).toJSON();

        //Assert
        expect(tree).toMatchSnapshot()
    })


    it("should render row with round information", () => {
        // Arrange
        const round = {id:1,
            first_player: "ROCK",
            second_player: 'ROCK',
            game_result: 'DRAW'
        };

        //Act
        const tree  = renderer.create(<GameTableRow round={round}/>).toJSON();

        //Assert
        expect(tree).toMatchSnapshot();

    })



})