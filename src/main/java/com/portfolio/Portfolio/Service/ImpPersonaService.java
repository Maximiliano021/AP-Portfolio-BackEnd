package com.portfolio.Portfolio.Service;

import com.portfolio.Portfolio.Entity.Persona;
import com.portfolio.Portfolio.Interface.IPersonaService;
import com.portfolio.Portfolio.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//para que la basa de datos lo registre como service
public class ImpPersonaService implements IPersonaService{
    //para que lea los campos que tengo
    final IPersonaRepository ipersonaRepository;

    public ImpPersonaService(IPersonaRepository ipersonaRepository) {
        this.ipersonaRepository = ipersonaRepository;
    }

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona = ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
}
