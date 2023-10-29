package com.springbootmicroservices.Product.Services.repository;

import com.springbootmicroservices.Product.Services.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepository extends MongoRepository<Product, String> {

}
