package com.leonardo.apibanco.service;

import com.leonardo.apibanco.model.domain.Usuario;
import com.leonardo.apibanco.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

//    @Autowired
//    private UsuarioRepository usuarioRepository;

    public Usuario buscarPorID (Long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public void eliminarPorId (Long id){
        if(!usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
        }
    }

}
