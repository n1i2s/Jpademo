package com.nishant.util;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.nishant.model.UserLogin;

@Service
public interface  UserRepository extends JpaRepository<UserLogin, Integer>{

}
