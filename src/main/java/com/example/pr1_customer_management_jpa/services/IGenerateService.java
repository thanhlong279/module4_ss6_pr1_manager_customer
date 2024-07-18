package com.example.pr1_customer_management_jpa.services;

import java.util.List;

public interface IGenerateService<T> {

    List<T> findAll();

    void save(T t);

    T findById(Long id);

    void remove(Long id);
}
