package pe.edu.vallegrande.sales.service;

import pe.edu.vallegrande.sales.model.dto.PersonDTO;
import pe.edu.vallegrande.sales.model.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    Optional<PersonDTO> findByEmailAndPassword(String email, String password);

    List<PersonDTO> findCustomersActive(boolean active);

    List<PersonDTO> findSellersActive(boolean active);

    Person saveEmployee(Person person);
    Person saveCustomer(Person person);
}
