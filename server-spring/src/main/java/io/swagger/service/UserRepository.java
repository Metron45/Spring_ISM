package io.swagger.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.User;
import io.swagger.model.Users;

public interface UserRepository extends JpaRepository<User,Long> {

	
	@Modifying
	@Query("update User s set s.name = ?2,"
			+ " s.surname = ?3,"
			+ " s.description = ?4,"
			+ " s.participantInfo =?5,"
			+ " s.email = ?6,"
			+ " s.password = ?7"
			+ " where s.id = ?1 ")
	void updateUserById(
			Integer id,
			String name,
			String surname,
			String description,
			String participantInfo,
			String email,
			String password
			);
	
    @Query("SELECT t FROM User t WHERE t.email = ?1 AND t.password = ?2")
    User findUser(String email, String password);
	
}
