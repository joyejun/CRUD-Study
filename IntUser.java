package com.sprint.mission;

public class IntUser implements User{
    private final String name;

    public IntUser(String name) {
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println("login");
    }

    @Override
    public void logout() {
        System.out.println("logout");
    }

    @Override
    public void build(){
        System.out.println("빌리다.");
    }
}
