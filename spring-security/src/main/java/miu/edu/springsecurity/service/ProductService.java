package miu.edu.springsecurity.service;

import miu.edu.springsecurity.entity.Product;

public interface ProductService {

    void save(Product p);

    void delete(int id);

    Product getById(int id);

    List<Product> getAll();
}
