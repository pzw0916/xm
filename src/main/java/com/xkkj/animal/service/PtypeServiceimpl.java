package com.xkkj.animal.service;

import com.xkkj.animal.dao.PtypeDao;
import com.xkkj.animal.entity.Ptype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PtypeServiceimpl {
    @Autowired
    private PtypeDao ptypeDao;
    public List<Ptype> findAll(){

        return   ptypeDao.findAll();
    }

}
