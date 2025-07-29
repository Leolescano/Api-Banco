package com.leonardo.apibanco.controller;

import com.leonardo.apibanco.model.domain.Usuario;
import com.leonardo.apibanco.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Usuario> buscarPorId (@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.buscarPorID(id));
    }
}
