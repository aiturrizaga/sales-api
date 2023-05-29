package pe.edu.vallegrande.sales.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.sales.model.entity.Product;
import pe.edu.vallegrande.sales.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/products")
public class ProductController {

    private final ProductService productService;


    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping
    public ResponseEntity<Product> getProducts(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

}
