package pe.edu.vallegrande.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.sales.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
