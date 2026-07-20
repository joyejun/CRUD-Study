package com.sprint.mission;

public interface IRepository{

    default void create(Member id){
        throw new RuntimeException("..");
    }
    default Member read(Member id){
        throw new RuntimeException("..");
    }
    default  void delete(Member id){
        throw new RuntimeException("..");
    }
    default  Member update(Integer id, Integer newId){
        throw new RuntimeException("...");
    }
}
