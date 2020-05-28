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
})