package com.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private DatosJson accesoABaseDeDatos;

    public GreetingController() {
        this.accesoABaseDeDatos = new DatosJson();
    }

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/api/registrarUsuario/{mail}/{contraseña}/{nombre}/{apellido}/{usuario}")
    public void registrarUsuarios(@PathVariable String mail, @PathVariable String contraseña, @PathVariable String nombre, @PathVariable String apellido, @PathVariable String usuario){
        this.accesoABaseDeDatos.registrarUsuarios(mail,contraseña,nombre,apellido,usuario);
    }







}