package com.user.user_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.user_services.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
