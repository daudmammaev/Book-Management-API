package app.demo.Controllers;

import app.demo.Services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    UserService userService;
    @PostMapping("/create")
    public String create(@RequestParam("username") String username, @RequestParam("password") String password){
        return  userService.create(username, password);
    }
}
