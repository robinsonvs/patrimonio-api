package com.digitec.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitec.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
