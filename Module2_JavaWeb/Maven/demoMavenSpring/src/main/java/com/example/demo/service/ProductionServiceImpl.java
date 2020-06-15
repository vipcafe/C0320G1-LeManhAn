package com.example.demo.service;

import com.example.demo.model.ProductionModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductionServiceImpl implements ProductionService{
    private static Map<Integer,ProductionModel> productionModelMap ;

    static {
        productionModelMap = new HashMap<>();
        productionModelMap.put(1,new ProductionModel(1,"SamSung A9",9000000,"SamSung"));
        productionModelMap.put(2,new ProductionModel(2,"SamSung A9",9000000,"SamSung"));
        productionModelMap.put(3,new ProductionModel(3,"SamSung A9",9000000,"SamSung"));
        productionModelMap.put(4,new ProductionModel(4,"SamSung A9",9000000,"SamSung"));
        productionModelMap.put(5,new ProductionModel(5,"SamSung A9",9000000,"SamSung"));

    }
    @Override
    public List<ProductionModel> showAll() {
        ArrayList<ProductionModel> productions = new ArrayList<>( productionModelMap.values());
        return productions;
    }

    @Override
    public ProductionModel findById(int id) {
        return productionModelMap.get(id);
    }

    @Override
    public void save(ProductionModel productionModel) {
        productionModelMap.put(productionModel.getId(),productionModel);
    }

    @Override
    public void update(int id, ProductionModel productionModel) {
        productionModelMap.put(productionModel.getId(),productionModel);
    }

    @Override
    public void remove(int id) {
        productionModelMap.remove(id);

    }

}
