// src/Components/CalculateScore.js
import React from 'react';
import '../StyleSheets/mystyle.css';

function CalculatorScore(props) {
  const { name, school, total, goal } = props;
  const average = total / goal;

  return (
    <div className="score-container">
      <h2>Student Score Calculator</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Marks:</strong> {total}</p>
      <p><strong>Number of Subjects:</strong> {goal}</p>
      <p><strong>Average Score:</strong> {average.toFixed(2)}</p>
    </div>
  );
}

export default CalculatorScore;
