package com.internship.entity;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class User {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String userId;
    private String name;

    public User() { this.userId = UUID.randomUUID().toString(); }


    public String getUserId(){ return userId; }

    public void setUserId(String userId) { this.userId = userId; }


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

   

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId+ '\'' +
                ",name='" + name + '\'' + '}';
    }
}
