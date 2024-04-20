package com.sridhar.instagram.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sridhar.instagram.Entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
