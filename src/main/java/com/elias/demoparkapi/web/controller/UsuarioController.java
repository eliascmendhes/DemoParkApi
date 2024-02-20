package com.elias.demoparkapi.web.controller;

import com.elias.demoparkapi.entity.Usuario;
import com.elias.demoparkapi.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;
    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        // encapsula as info da requisicao
       Usuario user = usuarioService.salvar(usuario);
       return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }
}
