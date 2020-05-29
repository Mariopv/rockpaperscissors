import * as React from 'react'
import GameStatistics from "./gameStatistics";
import renderer from "react-test-renderer";
import './../../config/setupEnzyme'

describe('<GameStatistics /> tests', () => {

    it("should render empty statistics", () => {
        // Act
        const tree = renderer.create(<GameStatistics />).toJSON();

        //Assert
        expect(tree).toMatchSnapshot()
    })

})
