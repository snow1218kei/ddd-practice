package com.sample.ddd.repository.sprint;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = 'sprint')
public class Sprint {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    //セッター・ゲッターは省略
}