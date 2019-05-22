package com.notjustmichael.services;

public interface ServiceInterface<T, ID> {
    T create(T type);

    T update(T type);

    void delete(ID id);

    T read(ID id);
}

