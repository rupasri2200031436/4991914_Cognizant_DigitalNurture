// Posts.js
import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: []
    };
  }

  // Step 6: Fetch posts using Fetch API
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        const postObjects = data.map(p => new Post(p.userId, p.id, p.title, p.body));
        this.setState({ posts: postObjects });
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
        alert('Failed to load posts.');
      });
  }

  // Step 7: Call loadPosts after component mounts
  componentDidMount() {
    this.loadPosts();
  }

  // Step 9: Catch any error in lifecycle
  componentDidCatch(error, info) {
    alert('An error occurred: ' + error);
    console.error('Error info:', info);
  }

  // Step 8: Display posts
  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id} style={{ marginBottom: '20px' }}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
