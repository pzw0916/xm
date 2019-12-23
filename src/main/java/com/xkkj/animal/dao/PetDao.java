package com.xkkj.animal.dao;

import com.xkkj.animal.entity.Pet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetDao extends JpaRepository<Pet,Integer> {
    //根据宠物名称模糊查询
    public List<Pet> findByPnameLike(String pname);

    public Page findAll(Pageable pageable);
}
