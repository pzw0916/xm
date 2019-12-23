package com.xkkj.animal.service;

import com.xkkj.animal.dao.PetDao;
import com.xkkj.animal.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PetServiceImpl {
    @Autowired
    private PetDao petDao;

    public Page findAll(Integer page, Integer rows){
        PageRequest pageable = PageRequest.of(page - 1, rows);
        Page all = petDao.findAll(pageable);
        return  all;
    }

    public void insert(Pet pet){
        petDao.save(pet);
    }

    public void delete(Integer id){
        petDao.deleteById(id);
    }

    public void update(Pet pet){
        petDao.saveAndFlush(pet);
    }

    public List<Pet> findByPnameLike(String pet){
        return petDao.findByPnameLike(pet);
    }
}
