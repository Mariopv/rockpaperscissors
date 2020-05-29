import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import GameBoard from "./components/gameBoard/gameBoard";
import GameStatistics from "./components/gameStatistics/gameStatistics";

ReactDOM.render(
    <div className="game">
        <GameBoard/>
        <GameStatistics/>
    </div>,
    document.getElementById('root')
);