package com.example.springwebservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// 使用 Lombok 加入 Getter, Setter, Constructor
// https://kucw.github.io/blog/2020/3/java-lombok/
@Getter
@Setter
@AllArgsConstructor // 生成一個包含所有參數的 constructor
@NoArgsConstructor // 生成一個沒有參數的constructor
@Entity
@Table(name="member")
public class User {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private int age;
}
