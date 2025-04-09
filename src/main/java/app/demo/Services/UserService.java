package app.demo.Services;

import app.demo.Repository.UserRepository;
import app.demo.models.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }

    public String create(String username, String password) {
        Userr userr = Userr.builder()
                .username(username)
                .password(new BCryptPasswordEncoder().encode(password))
                .authorities("user")
                .build();

        userRepo.save(userr);

        return "Create Successfully !";
    }
}
