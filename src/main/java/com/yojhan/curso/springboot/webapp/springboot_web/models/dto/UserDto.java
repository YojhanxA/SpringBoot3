package com.yojhan.curso.springboot.webapp.springboot_web.models.dto;

import com.yojhan.curso.springboot.webapp.springboot_web.models.User;

public class UserDto {

    private String tittle;
    private User user;
    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    
}
