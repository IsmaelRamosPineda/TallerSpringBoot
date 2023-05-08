package es.prueba.Projecto_demo_Springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImp implements MessageService {
	
	@Value("${course.message:${course.defaultmessage}")
	private String message2;
	
	@Value("${course.messageK:VALOR POR DEFECTO LITERAL}")
	private String message;
	
	@Override
	public String getMessage() {
		return message;
	}

}
