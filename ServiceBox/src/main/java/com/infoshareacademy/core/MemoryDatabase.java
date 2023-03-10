package com.infoshareacademy.core;

import com.infoshareacademy.model.Client;
import com.infoshareacademy.model.Task;
import com.infoshareacademy.model.Vehicle;

import java.util.ArrayList;

public class MemoryDatabase implements DatabaseInterface {
    private static final ArrayList<Task> tasks = new ArrayList<>();
    private static final ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static final ArrayList<Client> clients = new ArrayList<>();

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public ArrayList<Client> getClients() {
        return clients;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public void saveTasks() {
        // nie obsługiwane w tej implementacji
    }

    @Override
    public void saveVehicles() {
        // nie obsługiwane w tej implementacji
    }

    @Override
    public void saveClients() {
        // nie obsługiwane w tej implementacji
    }
}
