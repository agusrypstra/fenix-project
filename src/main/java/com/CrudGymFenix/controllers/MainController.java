package com.CrudGymFenix.controllers;
import com.CrudGymFenix.models.UsuarioModel;
import com.CrudGymFenix.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping("api")
public class MainController {
    private final UsuarioService usuarioService;
    @Autowired
    public MainController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/saludar")
    public String saludar(){
        return "Hola loco";
    }
    @GetMapping("/error")
    public String error(){
        return "error";
    }
    @GetMapping("/users")
    public ArrayList<UsuarioModel> getAllUsers(){
        return usuarioService.getAllUsers();
    }
}
