package pe.edu.vallegrande.sales.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.sales.model.dto.PersonDTO;
import pe.edu.vallegrande.sales.model.dto.RoleDTO;
import pe.edu.vallegrande.sales.model.entity.Person;
import pe.edu.vallegrande.sales.model.entity.Role;
import pe.edu.vallegrande.sales.repository.PersonRepository;
import pe.edu.vallegrande.sales.service.PersonService;

import java.util.*;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Optional<PersonDTO> findByEmailAndPassword(String email, String password) {
        return personRepository.findByEmailAndPassword(email, password).map(this::convertToDto);
    }

    @Override
    public List<PersonDTO> findCustomersActive(boolean active) {
        return convertToDtoList(personRepository.findAllByTypeAndActive("CUSTOMER", active));
    }

    @Override
    public List<PersonDTO> findSellersActive(boolean active) {
        return convertToDtoList(personRepository.findAllByTypeAndActive("SELLER", active));
    }

    @Override
    public Person saveEmployee(Person person) {
        person.setType("SELLER");
        person.setRoles(setRole("ROLE_SELLER"));
        return personRepository.save(person);
    }

    @Override
    public Person saveCustomer(Person person) {
        person.setType("CUSTOMER");
        person.setRoles(setRole("ROLE_CUSTOMER"));
        return personRepository.save(person);
    }

    private PersonDTO convertToDto(Person res) {
        Set<RoleDTO> roles = new LinkedHashSet<>();
        res.getRoles().forEach(rol -> roles.add(RoleDTO.builder().id(rol.getId()).build()));
        return PersonDTO.builder()
                .id(res.getId())
                .name(res.getName())
                .lastname(res.getLastname())
                .adress(res.getAdress())
                .phone(res.getPhone())
                .birthdate(res.getBirthdate())
                .email(res.getEmail())
                .active(res.isActive())
                .roles(roles)
                .build();
    }

    private List<PersonDTO> convertToDtoList(List<Person> persons) {
        List<PersonDTO> list = new ArrayList<>();
        persons.forEach(res -> list.add(convertToDto(res)));
        return list;
    }

    private Set<Role> setRole(String idRol) {
        Set<Role> roles = new LinkedHashSet<>();
        Role role = new Role();
        role.setId(idRol);
        roles.add(role);
        return roles;
    }
}

