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

})