package com.javarush.lectures.rest_lesson.service;

import com.javarush.lectures.rest_lesson.model.Client;

import java.util.List;

public interface ClientService {
    void create(Client client);

    List<Client> readAll();

    Client read(int id);

    boolean update(Client client, int id);

    boolean delete(int id);
}
