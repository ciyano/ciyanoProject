package com.ciyano.project.Dao;

import com.ciyano.project.Entité.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository  extends JpaRepository <User, Integer>{
   public  User findByEmailId(String emailId);
  public  User findByEmailIdAndPassword(String emailId, String password);
}
