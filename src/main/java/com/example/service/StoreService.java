package com.example.service;

import com.example.model.Store;
import com.example.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StoreService {
    @Autowired
    StoreRepository storeRepository;

    public Store findStore(Long id) { return storeRepository.findOne(id); }
    public List<Store> findAllStores() { return storeRepository.findAll(); }
    public Store save(Store store) { return storeRepository.save(store); }
    public void delete(Long id) { storeRepository.delete(id); }
}
