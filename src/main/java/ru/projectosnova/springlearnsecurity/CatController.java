package ru.projectosnova.springlearnsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @Autowired
    UserRepository repoUser;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/auth")
    public ResponseEntity<?> getToken(@RequestBody User user){

        try{
            User dbuser = repoUser.findByLogin(user.getLogin());
            if (passwordEncoder.matches(user.getPassword(),dbuser.getPassword())){
                return new ResponseEntity<User>(dbuser, HttpStatus.OK);
            }
        }
        catch (Exception e){}
        return new ResponseEntity<String>("Login incorrect", HttpStatus.UNAUTHORIZED);

    }



}
