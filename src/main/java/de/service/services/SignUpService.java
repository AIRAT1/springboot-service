package de.service.services;

import de.service.forms.UserForm;
import org.springframework.stereotype.Service;

@Service
public interface SignUpService {
    void signUp(UserForm userForm);
}
