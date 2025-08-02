// src/App.js
import React from 'react';
import CalculateScore from './Components/CalculatorScore';

function App() {
  return (
    <div className="App">
      <CalculateScore name="Ravi Kumar" school="Green Valley School" total={480} goal={6} />
    </div>
  );
}

export default App;
