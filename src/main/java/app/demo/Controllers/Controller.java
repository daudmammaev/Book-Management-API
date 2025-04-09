package app.demo.Controllers;


import app.demo.Services.BookServicesImpl;
import app.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
@RequestMapping("/auth")
public class Controller {

    public BookServicesImpl bookServices;

    @GetMapping("/books")
    public String listBooks(Model model) {
        model.addAttribute("books", bookServices.getAll());
        return "bookList";
    }

}
