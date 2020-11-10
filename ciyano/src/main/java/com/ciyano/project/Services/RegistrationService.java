package com.ciyano.project.Services;



import com.ciyano.project.Dao.RegistrationRepository;
import com.ciyano.project.Entité.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository repo ;

    public User saveUser(User user){

        return repo.save(user);

    }

    public User fetchUserByEmailId(String email){

        return repo.findByEmailId(email);

    }


    public User fetchUserByEmailIdAndPass(String email, String password){
        return repo.findByEmailIdAndPassword(email, password);
    }
}
