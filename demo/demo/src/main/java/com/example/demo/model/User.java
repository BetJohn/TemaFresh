package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @NotNull
    private Integer id;
    private String name;
    @OneToOne
    Wishlist wishlist;

    public void setWishlist(Wishlist wishlist) {
        this.wishlist = wishlist;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @OneToOne
    Cart cart;
}
