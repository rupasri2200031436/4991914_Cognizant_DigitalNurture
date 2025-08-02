import React from 'react';

function App() {
  // Step 1: Create single office object
  const office = {
    name: "Dream Office Hub",
    rent: 75000,
    address: "Plot 12, Tech Park, Hyderabad",
    image: "https://t4.ftcdn.net/jpg/03/84/55/29/360_F_384552930_zPoe9zgmCF7qgt8fqSedcyJ6C6Ye3dFs.jpg"
  };

  // Step 2: List of offices
  const offices = [
    { name: "Alpha Space", rent: 55000, address: "MG Road, Bangalore" },
    { name: "Beta Tower", rent: 62000, address: "Indiranagar, Bangalore" },
    { name: "Gamma Bay", rent: 45000, address: "Cyber City, Gurgaon" },
    { name: "Delta Plaza", rent: 78000, address: "Kondapur, Hyderabad" },
  ];

  // Step 3: JSX Return
  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      {/* Heading */}
      <h1 style={{ color: 'navy' }}>Office Space Rental Application</h1>

      {/* Office Image */}
      <img src={office.image} alt="Office" width="400" height="200" />

      {/* Single Office Details */}
      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p><strong>Rent:</strong> <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>₹{office.rent}</span></p>
      <p><strong>Address:</strong> {office.address}</p>

      {/* List of Offices */}
      <h2>Available Offices</h2>
      <ul>
        {offices.map((item, index) => (
          <li key={index} style={{ marginBottom: '10px' }}>
            <strong>{item.name}</strong> - 
            <span style={{ color: item.rent < 60000 ? 'red' : 'green', marginLeft: '5px' }}>
              ₹{item.rent}
            </span>
            <div>{item.address}</div>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
