package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	@Modifying
	@Query("update User s set s.name = ?2, s.surname = ?3, s.description = ?4, s.participantInfo =?5, email = ?6, password = ?7, image = ?8 where s.id = ?1 ")
	void updateUserById(Integer id, String name, String surname, String description, String participantInfo, String email, String password, Object image);
	
	@Query("SELECT u FROM User u WHERE u.email = ?1, u.password = ?2")
	User loginUser(String email, String password);
}
