import React from 'react'
import renderer from 'react-test-renderer'
import {GameTable} from './gameTable'

describe('<GameTable /> tests', () => {

    it("should render an empty table", () => {
        // Act
        const tree = renderer.create(<GameTable />).toJSON();

        //Assert
        expect(tree).toMatchSnapshot()
    })

    it("should render table with rounds information", () => {
        // Arrange
        let rounds = [{
            first_player: "ROCK",
            second_player: 'ROCK',
            game_result: 'DRAW'
        }];

        //Act
        const tree  = renderer.create(<GameTable rounds={rounds}/>).toJSON();

        //Assert
        expect(tree).toMatchSnapshot();

    })
})