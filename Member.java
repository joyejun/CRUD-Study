package com.sprint.mission;


public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;

    public Member(Integer id, String name, int age, String email){
        this.id = id;
        this.name = name;
        this.age =age;
        this.email = email;

    }

//    public Integer getId(Integer id) {
//        return this.id;
//    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
