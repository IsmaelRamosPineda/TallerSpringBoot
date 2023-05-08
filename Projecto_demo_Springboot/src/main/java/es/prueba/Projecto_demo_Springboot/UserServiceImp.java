package es.prueba.Projecto_demo_Springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}
	
//	@Override
//	public User getUserById(Integer id) {
//		return repository.findById(id);
//	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void updateUser (Integer id, User user){
		// TODO Auto-generated method stub
		
	}


}
