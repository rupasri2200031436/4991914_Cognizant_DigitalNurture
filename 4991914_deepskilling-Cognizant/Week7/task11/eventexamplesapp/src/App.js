import React, { useState } from 'react';
import CurrencyConvertor from './Component/CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  // Increments the counter
  const increment = () => {
    setCount(count + 1);
  };

  // Decrements the counter
  const decrement = () => {
    setCount(count - 1);
  };

  // Multiple actions on one button
  const sayHello = () => {
    console.log("Hello! Welcome to the Event Handler App.");
  };

  const handleIncrease = () => {
    increment();
    sayHello();
  };

  // Passing argument to event handler
  const sayWelcome = (message) => {
    alert(`Welcome message: ${message}`);
  };

  // Synthetic event handler
  const onPress = (e) => {
    alert("I was clicked");
    console.log("Synthetic event object:", e);
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>React Event Handling Examples</h1>

      <h2>Counter: {count}</h2>
      <button onClick={handleIncrease}>Increase</button>{' '}
      <button onClick={decrement}>Decrease</button>

      <br /><br />
      <button onClick={() => sayWelcome("You are amazing!")}>Say Welcome</button>

      <br /><br />
      <button onClick={onPress}>OnPress (Synthetic Event)</button>

      <br /><br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
