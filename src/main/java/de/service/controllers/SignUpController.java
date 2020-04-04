package de.service.controllers;

import de.service.forms.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {
    @PostMapping("/signUp")
    public String signUp(UserForm userForm) {

    }
}
