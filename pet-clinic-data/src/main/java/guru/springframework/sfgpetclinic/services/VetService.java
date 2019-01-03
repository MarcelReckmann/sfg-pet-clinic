package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findbyId(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
