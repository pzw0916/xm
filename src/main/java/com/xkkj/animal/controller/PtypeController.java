package com.xkkj.animal.controller;
import com.xkkj.animal.config.ResponseResult;
import com.xkkj.animal.entity.Ptype;
import com.xkkj.animal.service.PtypeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PtypeController {
    @Autowired
    private PtypeServiceimpl ptypeServiceimpl;
    @GetMapping("findBrand")
    public ResponseResult findAll(){
        ResponseResult responseResult=new ResponseResult();
        List<Ptype> all = ptypeServiceimpl.findAll();
        responseResult.setData(all);
        return responseResult;
    }
}
