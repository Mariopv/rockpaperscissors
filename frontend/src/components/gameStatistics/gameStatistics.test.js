import * as React from 'react'
import GameStatistics from "./gameStatistics";
import renderer from "react-test-renderer";
import './../../config/setupEnzyme'
import {shallow} from 'enzyme';

describe('<GameStatistics /> tests', () => {

    it("should render empty statistics", () => {
        // Act
        const tree = renderer.create(<GameStatistics />).toJSON();

        //Assert
        expect(tree).toMatchSnapshot()
    })

    it("should render some statistics", () => {
        // Arrange
        const component = shallow(<GameStatistics/>)
        const statistics = [4,3,0,1]


        // Act
        component.instance().setStatistics(statistics);
        const tree = component.find('.game-statistics');


        //Assert
        expect(tree.find('.totalRounds').props().children[0]).toEqual("Total played rounds:  ");
        expect(tree.find('.totalRounds').props().children[1]).toEqual(4);
    })

})
