package com.exittest.backend.service;

import com.exittest.backend.dao.ProductDao;
import com.exittest.backend.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;
    public Product addNewProduct(Product product)
    {
       return productDao.save(product);
    }

    public List<Product> getAllProducts()
    {
       return (List<Product>)productDao.findAll();
    }

    public List<Product> getProductByName(String productName)
    {
        List<Product> product= productDao.findByProductName(productName);
        return product;
    }
}
