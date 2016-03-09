package com.fererlab.cdi.service;


import com.fererlab.cdi.model.Product;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class ProductService {

    public List<Product> findAll() {
        return new ArrayList<Product>() {{
            add(new Product(1, "Cherry"));
            add(new Product(2, "Berry"));
            add(new Product(3, "Kiwi"));
        }};
    }

    public Product find(Integer id) {
        return new Product(id, "Friday");
    }

}
