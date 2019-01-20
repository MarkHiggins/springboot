package com.fujitsu.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.stereotype.Component;


@JsonComponent
@ConfigurationProperties(prefix = "person")
public class Person {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getBitrhday() {
        return bitrhday;
    }

    public void setBitrhday(String bitrhday) {
        this.bitrhday = bitrhday;
    }

    private String id;

    private String username;

    private String gander;

    private String bitrhday;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", gander='" + gander + '\'' +
                ", bitrhday='" + bitrhday + '\'' +
                '}';
    }
}
