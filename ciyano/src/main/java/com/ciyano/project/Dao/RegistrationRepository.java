package com.ciyano.project.Dao;

import com.ciyano.project.Entité.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository  extends JpaRepository <User, Integer>{
    User findByEmailId(String email);
}
