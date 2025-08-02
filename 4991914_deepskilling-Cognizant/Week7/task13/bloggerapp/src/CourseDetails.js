function CourseDetails() {
  const courses = [
    { name: "Angular", date: "4/5/2025" },
    { name: "React", date: "6/3/2025" },
  ];

  return (
    <div className="section">
      <h2>Course Details</h2>
      {courses.map((course, index) => (
        <div key={index}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
