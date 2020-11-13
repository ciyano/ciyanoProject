package com.ciyano.project.Web;
import com.ciyano.project.Entité.User;
import com.ciyano.project.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController

public class SecurityWeb {

    @Autowired
    private RegistrationService service;


    @PostMapping("/saveUser")
    @CrossOrigin(origins = "http://localhost:4200")
    public User registerUser(@RequestBody User user) throws Exception {
        String tempEmailId = user.getEmailId();
        if (tempEmailId != null && "".equals(tempEmailId)) {
            User userObj = service.fetchUserByEmailId(tempEmailId);
            if (userObj != null) {
                throw new Exception("user with " + tempEmailId + "is already exist");
            }
        }

        User userObj = null;
        userObj = service.saveUser(user);
        return userObj;
    }
    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:4200")
    public User loginUser(@RequestBody User user) throws Exception{
        String tempEmailId = user.getEmailId();
        String tempPass = user.getPassword();
        User userObj = null;
        if (tempEmailId !=null && tempPass != null) {
            userObj =  service.fetchUserByEmailIdAndPass(tempEmailId, tempPass);
        }
   if(userObj == null){
       throw new Exception("bad credentials");
   }
           return userObj;
    }

}
