package com.notjustmichael.repository;

public interface RepositoryInterface<T,ID> {
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
