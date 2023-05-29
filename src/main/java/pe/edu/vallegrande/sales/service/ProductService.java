package pe.edu.vallegrande.sales.service;

import pe.edu.vallegrande.sales.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product save(Product product);
}
