package com.mythredd.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mythredd.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
