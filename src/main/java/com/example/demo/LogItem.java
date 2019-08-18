package com.example.demo;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Author: liuyangren
 * Date:
 * Time:
 */
@Entity
@Data
public class LogItem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public LogItem() {
    }

    public LogItem(String name) {
        this.name = name;
    }



}
