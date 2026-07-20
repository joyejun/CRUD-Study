package com.sprint.mission;

public interface IRepository<T,V> {

    default void create(T id){
        throw new RuntimeException("..");
    }
    default T read(T id){
        throw new RuntimeException("..");
    }
    default  void delete(T id){
        throw new RuntimeException("..");
    }
    default  T update(Integer id, Integer newId){
        throw new RuntimeException("...");
    }
}
