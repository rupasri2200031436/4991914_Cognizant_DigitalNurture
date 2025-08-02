// src/App.js
import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohortData = [
    {
    name: 'DNP4J001 - Java Full Stack',
    status: 'Ongoing',
    startDate: '01-Jul-2025',
    coach: 'Anjali Mehta',
    trainer: 'Rahul Kumar'
  },
  {
    name: 'DNP4N002 - .NET Full Stack',
    status: 'Ongoing',
    startDate: '05-Jul-2025',
    coach: 'Vikas Sharma',
    trainer: 'Sneha Rao'
  }
  ];

  return (
    <div style={{ padding: '20px' }}>
      <h1 style={{ fontWeight: 'bold' }}>Digital Nurture 4.0 Cohort Details</h1>
      <div style={{ display: 'flex', flexWrap: 'wrap', gap: '20px' }}>
        {cohortData.map((cohort, index) => (
          <CohortDetails key={index} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;
