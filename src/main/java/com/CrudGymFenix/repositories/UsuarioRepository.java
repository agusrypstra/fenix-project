package com.CrudGymFenix.repositories;
import com.CrudGymFenix.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {}
