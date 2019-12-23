package com.xkkj.animal.controller;

import com.xkkj.animal.config.ResponseResult;
import com.xkkj.animal.entity.Pet;
import com.xkkj.animal.service.PetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {
    @Autowired
    private PetServiceImpl petService;
    @GetMapping("findAll")
    public ResponseResult findAll(@RequestParam(defaultValue = "1",value = "page") Integer page,
                                  @RequestParam(defaultValue = "5",value = "rows")Integer rows) {
        ResponseResult responseResult = new ResponseResult();
        System.out.println("kl"+page+":"+rows);
        responseResult.setData(petService.findAll(page,rows));
        return responseResult;
    }

    //根据id查询
    @GetMapping("findByPnameLike")
    public ResponseResult findByPnameLike(String pname) {
        ResponseResult responseResult = new ResponseResult();
        List<Pet> all2 = petService.findByPnameLike(pname);
        responseResult.setData(all2);
        return responseResult;
    }

    @GetMapping("delete")
    public ResponseResult delete(Integer id) {
        ResponseResult responseResult = new ResponseResult();
        try {
            petService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            responseResult.setState(500);
            responseResult.setMsg("删除失败！");
        }
        return responseResult;
    }
    @PostMapping("insert")
    public ResponseResult insert(@RequestBody Pet pet) {
        System.out.println(pet);
        ResponseResult responseResult = new ResponseResult();
        try {
            petService.insert(pet);
        } catch (Exception e) {
            e.printStackTrace();
            responseResult.setState(500);
            responseResult.setMsg("新增失败！");
        }
        return responseResult;
    }
    @PutMapping("update")
    public ResponseResult update(@RequestBody Pet pet) {
        //System.out.println(phone);
        ResponseResult responseResult = new ResponseResult();
        try {
            petService.update(pet);
        } catch (Exception e) {
            e.printStackTrace();
            responseResult.setState(500);
            responseResult.setMsg("修改失败！");
        }
        return responseResult;
    }
}
