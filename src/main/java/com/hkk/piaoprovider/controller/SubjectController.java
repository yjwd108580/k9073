package com.hkk.piaoprovider.controller;

import com.hkk.bean.Subject;
import com.hkk.piaoprovider.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    SubjectService sc;
    @RequestMapping("addSubject")
    public int addSubject(Subject sb){

        return sc.addSubject(sb);
    }


    @RequestMapping("queryAll")
    public List<Subject> queryAll(){
        return sc.queryAll();
    }
    @RequestMapping("queryByzid")
    public Subject queryByzid( @RequestParam("zid")Integer zid){
        System.out.println(zid+"======================");

        return sc.queryByzid(zid);
    }

    @RequestMapping("updatetotalvotes")
    public int updatetotalvotes(Integer zid){
        return sc.updatetotalvotes(zid);
    }
    @RequestMapping("updateviewtimes")
    public int updateviewtimes(Integer zid){
        return sc.updateviewtimes(zid);
    }
}
