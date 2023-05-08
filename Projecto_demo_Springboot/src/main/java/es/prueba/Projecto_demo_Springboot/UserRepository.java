package es.prueba.Projecto_demo_Springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Integer> {


    List<User> findAll();
    
//    @Query("SELECT ptype FROM PetType ptype ORDER BY ptype.name")
//    @Transactional(readOnly = true)
//    public Optional<User> findById(Integer id);

//    public save(User user);

}

