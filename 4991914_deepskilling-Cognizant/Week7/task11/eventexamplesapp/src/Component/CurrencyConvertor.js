import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [currencyName, setCurrencyName] = useState('');
  const [converted, setConverted] = useState('');
  const [error, setError] = useState('');

  // Exchange rates (1 foreign currency = X INR)
  const rates = {
    euro: 90,
    dollar: 83,
    pound: 105,
    yen: 0.57,
    aud: 55,
    cad: 61,
    franc: 94,
    won: 0.063
  };

  const symbols = {
    euro: '€',
    dollar: '$',
    pound: '£',
    yen: '¥',
    aud: 'A$',
    cad: 'C$',
    franc: 'CHF',
    won: '₩'
  };

  const handleSubmit = () => {
    const currency = currencyName.trim().toLowerCase();
    setError('');
    setConverted('');

    if (!rupees || isNaN(rupees)) {
      setError('❌ Please enter a valid amount in Rupees.');
      return;
    }

    if (!rates[currency]) {
      setError(`❌ Currency "${currency}" not supported. Try: ${Object.keys(rates).join(', ')}`);
      return;
    }

    const result = parseFloat(rupees) / rates[currency];
    const formatted = `${symbols[currency] || ''}${result.toFixed(2)}`;
    setConverted(formatted);
  };

  return (
    <div style={{ border: '1px solid gray', padding: '20px', width: '400px' }}>
      <h2>Currency Converter</h2>

      <label>Amount in Rupees (INR):</label>
      <input
        type="text"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
        placeholder="e.g. 9000"
      />
      <br /><br />

      <label>Convert to Currency:</label>
      <input
        type="text"
        value={currencyName}
        onChange={(e) => setCurrencyName(e.target.value)}
        placeholder="e.g. dollar, euro, yen"
      />
      <br /><br />

      <button onClick={handleSubmit}>Convert</button>

      {error && <p style={{ color: 'red' }}>{error}</p>}

      {converted && (
        <p style={{ color: 'green', fontWeight: 'bold' }}>
          Converted Amount: {converted}
        </p>
      )}
    </div>
  );
}

export default CurrencyConvertor;
