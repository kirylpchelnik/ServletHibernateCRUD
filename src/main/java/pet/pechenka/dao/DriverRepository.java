package pet.pechenka.dao;

import pet.pechenka.entity.Driver;

import java.util.List;

public interface DriverRepository {

    public Driver findById(int id);
    public void save(Driver driver);
    public void update(Driver driver);
    public void delete(Driver driver);
    public List<Driver> findAllDrivers();

}
