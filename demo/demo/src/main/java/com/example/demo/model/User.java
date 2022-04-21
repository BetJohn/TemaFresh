package com.example.demo.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @GeneratedValue
    @Id
    @NotNull
    private Integer id;
    private String name;
    @OneToOne
    Wishlist wishlist;
    @OneToOne
    Cart cart;
}
