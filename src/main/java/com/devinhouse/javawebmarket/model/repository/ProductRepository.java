package com.devinhouse.javawebmarket.model.repository;

import com.devinhouse.javawebmarket.model.persistence.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
