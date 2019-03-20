package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@PostMapping("/user")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		// Add user to database here
		 return new ResponseEntity<>("User " + user.getId() + " created" , HttpStatus.OK);
	}	
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable String id){
		// Retrieve user from database here
	    return new ResponseEntity<>(new User(Long.valueOf(id), "abc", "01/01"), HttpStatus.OK);
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<?> updateUser(@PathVariable String id) {
		// Update the user from database here
	    return new ResponseEntity<>("User " + id + " updated" , HttpStatus.OK);
	}
	 
	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable String id){
		// Delete the user from database here
	    return new ResponseEntity<>("User " + id + " deleted" , HttpStatus.OK);
	}
	
	
}
