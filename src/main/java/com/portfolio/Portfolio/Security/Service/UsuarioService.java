/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Portfolio.Security.Service;

import com.portfolio.Portfolio.Security.Entity.Usuario;
import com.portfolio.Portfolio.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//trata de mantener lo mismo con la base de datos
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository isuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return isuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreUsuario(String nombreUsuario){
        return isuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email){
        return isuarioRepository.existsByEmail(email);
    }
    //guarda un usuario nuevo
    public void save(Usuario usuario){
        isuarioRepository.save(usuario);
    }
}
