package es.prueba.Projecto_demo_Springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v2")
public class UserController {
	
	@Autowired
	private UserService service;


	@GetMapping(value = "/users")
	public ResponseEntity<List<User>> getUsers(){
		
		return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
	}
}
