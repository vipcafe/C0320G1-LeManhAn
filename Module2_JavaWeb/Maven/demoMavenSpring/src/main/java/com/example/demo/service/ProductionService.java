package com.example.demo.service;

import com.example.demo.model.ProductionModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProductionService {
    List<ProductionModel> showAll();
    ProductionModel findById(int id);
    void save(ProductionModel productionModel);
    void update (int id ,ProductionModel productionModel);
    void remove(int id);
}
