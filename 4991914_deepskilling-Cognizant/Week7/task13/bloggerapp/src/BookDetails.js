function BookDetails() {
  const books = [
    { name: "Master React", price: 770},
    { name: "Deep Dive into Angular 11", price: 950 },
    { name: "Mongo Essentials", price: 450 },
  ];

  return (
    <div className="section">
      <h2>Book Details</h2>
      {books.map((book, index) => (
        <div key={index}>
          <h3>{book.name}</h3>
          <p>{book.price}</p>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
