package produc.service;

import org.springframework.stereotype.Service;
import produc.model.production;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductionServiceImpl implements ProductionService {
    private static Map<Integer,production> productions ;
    static {
        productions = new HashMap<>();
        productions.put(1,new production(1,"Laptop", 5000000,"Lap top dep gia re"));
        productions.put(2,new production(2,"Laptop", 5000000,"Lap top dep gia re"));
        productions.put(3,new production(3,"Laptop", 5000000,"Lap top dep gia re"));
        productions.put(4,new production(4,"Laptop", 5000000,"Lap top dep gia re"));
        productions.put(5,new production(5,"Laptop", 5000000,"Lap top dep gia re"));
    }
    @Override
    public List<production> findAll() {
        return new ArrayList<>(productions.values());
    }

    @Override
    public void save(production production) {
        productions.put(production.getId(),production);

    }

    @Override
    public production findById(int id) {
        return productions.get(id);
    }

    @Override
    public void update(int id, production production) {
        productions.put(id,production);
    }

    @Override
    public void remove(int id) {
        productions.remove(id);
    }
}
