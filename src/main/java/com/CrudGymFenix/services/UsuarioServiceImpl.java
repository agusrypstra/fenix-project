package com.CrudGymFenix.services;

import com.CrudGymFenix.models.UsuarioModel;
import com.CrudGymFenix.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;
@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public ArrayList<UsuarioModel> getAllUsers() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    @Override
    public Optional<UsuarioModel> getUserById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public UsuarioModel saveUser(UsuarioModel u) {
        return usuarioRepository.save(u);
    }
    @Override
    public boolean deleteUserById(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
