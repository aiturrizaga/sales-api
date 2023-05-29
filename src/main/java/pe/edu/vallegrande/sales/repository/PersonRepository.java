package pe.edu.vallegrande.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.sales.model.entity.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
    Optional<Person> findByEmailAndPassword(String email, String password);

    List<Person> findAllByTypeAndActive(String type, boolean active);
}
