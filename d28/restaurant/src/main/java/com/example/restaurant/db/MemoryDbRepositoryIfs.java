package com.example.restaurant.db;

import java.util.List;
import java.util.Optional;

public interface MemoryDbRepositoryIfs<T> {

    Optional<T> findById(int index);

    T save(T entity);

    void deleteById(int index);

<<<<<<< HEAD
    List<T> findAll();
=======
    List<T> listAll();
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
}
