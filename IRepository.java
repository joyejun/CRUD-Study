package com.sprint.mission;

public interface IRepository{

    default void create(Member id){
        throw new RuntimeException("..");
    }
    default  void read(Member id){
        throw new RuntimeException("..");
    }
    default  void delete(Member id){
        throw new RuntimeException("..");
    }
    default  void update(Member email){
        throw new RuntimeException("...");
    }
}
