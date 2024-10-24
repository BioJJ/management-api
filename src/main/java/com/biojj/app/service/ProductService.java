package com.biojj.app.service;

import com.biojj.app.domain.Category;
import com.biojj.app.domain.Product;
import com.biojj.app.domain.dtos.ProductDTO;
import com.biojj.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryService categoryService;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(ProductDTO product) {
        return productRepository.save(newProduct(product));
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    private Product newProduct(ProductDTO obj) {
        Category category = categoryService.findById(obj.getCategoryId()).get();

        Product product = new Product();
        if (obj.getId() != null) {
            product.setId(obj.getId());
        }

        product.setCategory(category);
        product.setName(obj.getName());
        product.setPrice(obj.getPrice());
        return product;

    }

}
