package com.epsi.Gestionnairedestock.controller;

import com.epsi.Gestionnairedestock.model.Product;
import com.epsi.Gestionnairedestock.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductRepo productRepo;

    @GetMapping
    public List<Product> getProductList() {
        return productRepo.findAll();
    }

    @GetMapping("/{productId}")
    public Optional<Product> getProductById(@PathVariable(name= "productId") Long id) {
        return productRepo.findById(id);
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @PutMapping("/{productId}")
    public Product updateProduct(@RequestBody Product product, @PathVariable(name= "productId") Long id) {
        product.setId(id);
        return productRepo.save(product);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable(name= "productId") Long id) {
        productRepo.deleteById(id);
    }
}
