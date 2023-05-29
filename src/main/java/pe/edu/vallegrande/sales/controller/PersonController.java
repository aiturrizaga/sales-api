package pe.edu.vallegrande.sales.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.sales.model.dto.LoginDTO;
import pe.edu.vallegrande.sales.model.dto.PersonDTO;
import pe.edu.vallegrande.sales.model.entity.Person;
import pe.edu.vallegrande.sales.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class PersonController {

    private final PersonService personService;

    @PostMapping("/auth/login")
    public ResponseEntity<Optional<PersonDTO>> authenticatePerson(@RequestBody LoginDTO dto) {
        return ResponseEntity.ok(personService.findByEmailAndPassword(dto.getEmail(), dto.getPassword()));
    }

    @GetMapping("/customers")
    public ResponseEntity<List<PersonDTO>> getCustomers(@RequestParam(name = "active", defaultValue = "true") boolean active) {
        return ResponseEntity.ok(personService.findCustomersActive(active));
    }

    @GetMapping("/employees")
    public ResponseEntity<List<PersonDTO>> getEmployees(@RequestParam(name = "active", defaultValue = "true") boolean active) {
        return ResponseEntity.ok(personService.findSellersActive(active));
    }

    @PostMapping("/customers")
    public ResponseEntity<Person> saveCustomer(@RequestBody Person person) {
        return ResponseEntity.ok(personService.saveCustomer(person));
    }

    @PostMapping("/employees")
    public ResponseEntity<Person> saveEmployee(@RequestBody Person person) {
        return ResponseEntity.ok(personService.saveEmployee(person));
    }

}
