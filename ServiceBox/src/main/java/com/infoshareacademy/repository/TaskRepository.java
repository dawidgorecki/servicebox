package com.infoshareacademy.repository;

import com.infoshareacademy.core.DatabaseInterface;
import com.infoshareacademy.model.Task;
import com.infoshareacademy.model.Vehicle;

import java.util.ArrayList;

public class TaskRepository {
    private final DatabaseInterface db;

    public TaskRepository(DatabaseInterface db) {
        this.db = db;
    }

    public Task findById(int id) throws Exception {
        for (Task task : db.getTasks()) {
            if (id == task.getId()) {
                return task;
            }
        }

        throw new Exception("Nie znaleziono zlecenia o podanym numerze (" + id + ")");
    }

    public ArrayList<Task> findByPlate(String plate) throws Exception {
        ArrayList<Task> foundedTasks = new ArrayList<>();

        for (Task task : db.getTasks()) {
            if (plate.equalsIgnoreCase(task.getVehicle().getPlateNumber())) {
                foundedTasks.add(task);
            }

        }

        if (foundedTasks.isEmpty()) {
            throw new Exception("Nie znaleziono zlecenia przypisanego do numeru rejestracyjnego");

        }
        return foundedTasks;

    }

    public ArrayList<Task> findByVehicleOwner(String clientName) throws Exception {
        ArrayList<Task> foundedVehicleOwner = new ArrayList<>();

        for (Task task : db.getTasks()) {
            if (clientName.equalsIgnoreCase(task.getClientName())) {
                foundedVehicleOwner.add(task);
            }

        }

        if (foundedVehicleOwner.isEmpty()) {
            throw new Exception("Nie znaleziono zlecenia przypisanego do Klienta");

        }
        return foundedVehicleOwner;
    }

    public ArrayList<Task> findAll() {
        return db.getTasks();
    }

    public int getNextId() {
        return db.getTasks().size() + 1;
    }
}
