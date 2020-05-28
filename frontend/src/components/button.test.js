import React from 'react'
import '@testing-library/jest-dom/extend-expect'
import { render } from '@testing-library/react'
import {Button} from "./button";

describe('<Button /> tests', () => {

    it("should render as default button", () => {
        // Act
        const { container } = render(<Button />)

        //Assert
        expect(container.firstChild).toMatchSnapshot()
    })

})