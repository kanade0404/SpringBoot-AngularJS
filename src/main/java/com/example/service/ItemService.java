package com.example.service;

import com.example.model.Item;
import com.example.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public Item findItem(Long id){
        return itemRepository.findOne(id);
    }
    public List<Item> findAllItems(){
        return itemRepository.findAll();
    }
    public Item save(Item item){
        return itemRepository.save(item);
    }
    public void delete(Long id){
        itemRepository.delete(id);
    }
}
