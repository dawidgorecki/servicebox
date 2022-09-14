package com.infoshareacademy.service;


import com.infoshareacademy.entity.ServiceOrder;
import com.infoshareacademy.entity.Vehicle;
import com.infoshareacademy.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }


    public Vehicle findVehicleById(int id){
        return vehicleRepository.find(id);


    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.add(vehicle);
    }
    public List<Vehicle> findByQuery(String query) {
        return vehicleRepository.findBy(query);

    }
}