package com.javarush.lectures.rest_lesson.service;

import com.javarush.lectures.rest_lesson.model.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ClientServiceImpl implements ClientService {

    // Хранилище клиентов
    private static final Map<Integer, Client> CLIENT_MAP = new HashMap<>();

    // Поле для генерации ID клиента
    private static final AtomicInteger CLIENT_ID = new AtomicInteger();

    // Создает нового клиента
    @Override
    public void create(Client client) {
        final int id = CLIENT_ID.incrementAndGet();
        client.setId(id);
        CLIENT_MAP.put(id, client);
    }

    // Возвращает список клиентов
    @Override
    public List<Client> readAll() {
        return new ArrayList<>(CLIENT_MAP.values());
    }

    // Возвращает клиента с заданным id
    @Override
    public Client read(int id) {
        return CLIENT_MAP.get(id);
    }

    // Обновляет клиентв
    @Override
    public boolean update(Client client, int id) {
        if (CLIENT_MAP.containsKey(id)) {
            client.setId(id);
            CLIENT_MAP.put(id, client);
            return true;
        }
        return false;
    }

    // Удаляет клиента
    @Override
    public boolean delete(int id) {
        return CLIENT_MAP.remove(id) != null;
    }
}
