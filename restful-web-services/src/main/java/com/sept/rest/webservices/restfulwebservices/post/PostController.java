package com.sept.rest.webservices.restfulwebservices.post;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PostController {
	
	@Autowired
	private PostJpaRepository postJpaRepository;
	
	@GetMapping("/jpa/users/{username}/posts")
	public List<Post> getAllPosts(@PathVariable String username){
		return postJpaRepository.findByUsername(username);
	}

	@GetMapping("/jpa/users/{username}/posts/{id}")
	public Post getPost(@PathVariable String username, @PathVariable long id){
		return postJpaRepository.findById(id).get();
	}

	// DELETE /users/{username}/posts/{id}
	@DeleteMapping("/jpa/users/{username}/posts/{id}")
	public ResponseEntity<Void> deletePost(
			@PathVariable String username, @PathVariable long id) {

		postJpaRepository.deleteById(id);

		return ResponseEntity.noContent().build();
	}

	//Edit/Update a Post
	//PUT /users/{user_name}/posts/{post_id}
	@PutMapping("/jpa/users/{username}/posts/{id}")
	public ResponseEntity<Post> addComment(
			@PathVariable String username,
			@PathVariable long id, @RequestBody Post post){
		
		post.setUsername(username);
		post.setId(id);
		
		Post postUpdated = postJpaRepository.save(post);
		
		return new ResponseEntity<Post>(post, HttpStatus.OK);
	}
	
	@PostMapping("/jpa/users/{username}/posts")
	public ResponseEntity<Void> createPost(
			@PathVariable String username, @RequestBody Post post){
		
		post.setUsername(username);
		
		Post createdPost = postJpaRepository.save(post);
		
		//Location
		//Get current resource url
		///{id}
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdPost.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}

}
