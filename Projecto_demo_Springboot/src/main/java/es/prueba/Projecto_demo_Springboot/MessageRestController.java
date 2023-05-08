package es.prueba.Projecto_demo_Springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class MessageRestController {
	
	@Autowired
	private MessageService service;
//
//	@GetMapping(value = "/message")
//	public ResponseEntity<String> helloWord(){
//		return ResponseEntity.status(HttpStatus.OK).body("Hello World");
//	}
	
	@Value("${course.message}")
	private String message;
	
//	@Value("$test.defect:${course.message}")
//	private String messageDefecto;
	
//	@GetMapping(value = "/message")
//	public String helloWord(){
//		return "Hello World";
//	}
	
	@GetMapping(value = "/message")
	public String helloWord(){
		return message;
	}

	@GetMapping(value = "/message2")
	public String hola(){
		return service.getMessage();
	}
}
