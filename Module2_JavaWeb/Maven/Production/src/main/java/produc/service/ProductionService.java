package produc.service;

import produc.model.production;

import java.util.List;

public interface ProductionService {
    List<production> findAll();
    void save(production production);
    production findById(int id);
    void update(int id ,production production );
    void remove(int id);

}
