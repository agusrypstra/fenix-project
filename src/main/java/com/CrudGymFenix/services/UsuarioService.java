package com.CrudGymFenix.services;
import com.CrudGymFenix.models.UsuarioModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public interface UsuarioService {
    ArrayList<UsuarioModel> getAllUsers();
    Optional<UsuarioModel> getUserById(long id);
    UsuarioModel saveUser(UsuarioModel u);
    boolean deleteUserById(long id);
}
