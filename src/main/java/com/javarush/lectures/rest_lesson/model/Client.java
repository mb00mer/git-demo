package com.javarush.lectures.rest_lesson.model;

public class Client {
    // ИД клиента
    private Integer id;
    // Имя клиента
    private String name;
    // Телефон клиента
    private String phone;
    // Электронная почта клиента
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
