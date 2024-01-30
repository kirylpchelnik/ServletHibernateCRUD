package pet.pechenka.services;

import pet.pechenka.dao.DriverRepository;
import pet.pechenka.dao.DriverRepositoryImpl;
import pet.pechenka.entity.Driver;

import java.util.List;

public class DriverService  implements DriverRepository {
    private DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();

    @Override
    public Driver findById(int id) {
        return driverRepository.findById(id);
    }

    @Override
    public void save(Driver driver) {
        driverRepository.save(driver);
    }

    @Override
    public void update(Driver driver) {
        driverRepository.update(driver);
    }

    @Override
    public void delete(Driver driver) {
        driverRepository.delete(driver);
    }

    @Override
    public List<Driver> findAllDrivers() {
        return driverRepository.findAllDrivers();
    }


}
