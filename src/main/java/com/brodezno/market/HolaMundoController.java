package com.brodezno.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar") // Esta es la URL base para este controlador
public class HolaMundoController {

    @GetMapping("/hola") // Esta es la URL final para este método
    public String saludar() {
        return "Sigue aprendiendo Spring Boot! 😎";
    }
}
