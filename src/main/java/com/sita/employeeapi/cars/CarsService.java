package com.sita.employeeapi.cars;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {

    private static Logger LOG = LoggerFactory.getLogger(CarsService.class);

    @Autowired
    private CarsRepository carsRepository;

    public Cars saveCars(Cars cars)
    {
        return carsRepository.save(cars);
    }

    public List<Cars> ListCars() {return carsRepository.findAll();}

    public void deleteCars(long carsId)
    {
        carsRepository.deleteById(carsId);
    }
}
