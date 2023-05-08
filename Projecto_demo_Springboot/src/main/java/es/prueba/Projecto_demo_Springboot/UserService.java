package es.prueba.Projecto_demo_Springboot;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	
	public List<User> getAllUsers();

//	public User getUserById(Integer id);
	
	public void saveUser (User user);
	
	public void deleteUser (User user);
	
	public void updateUser (Integer id, User user);

}
