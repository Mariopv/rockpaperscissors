import React from 'react'
import '@testing-library/jest-dom/extend-expect'
import { render,fireEvent } from '@testing-library/react'
import {Button} from "./button";

describe('<Button /> tests', () => {

    it("should render as default button", () => {
        // Act
        const { container } = render(<Button />)

        //Assert
        expect(container.firstChild).toMatchSnapshot()
    })

    it("should render the button with some text", () => {
        // Arrange
        const text = "Play round"

        // Act
        const { getByText, container } = render(<Button>{text}</Button>)

        // Assert
        expect(container).toMatchSnapshot()
        getByText(text)
    })

    it('should call the click callback handler', () => {
        // Arrange
        const content = "Play Round"
        const onClick = jest.fn()

        // Act
        const { getByText } = render(<Button onClick={onClick}>{content}</Button>)
        fireEvent.click(getByText(content))

        // Assert
        expect(onClick).toHaveBeenCalledTimes(1)
    })

})