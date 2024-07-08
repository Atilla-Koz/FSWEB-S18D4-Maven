package com.workintech.s18d1.dao;

import com.workintech.s18d1.entity.Burger;

import java.util.List;

public interface BurgerDao {
    Burger save(Burger burger);

    List<Burger> findAll();

    Burger findById(Long id);

    Burger update(Burger burger);

    Burger remove(Long id);

    List<Burger> findByPrice(Integer price);

    List<Burger> findByBreadType(String breadType);

    List<Burger> findByContent(String content);
}
