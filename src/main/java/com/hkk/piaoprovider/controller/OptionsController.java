package com.hkk.piaoprovider.controller;

import com.hkk.bean.Options;
import com.hkk.piaoprovider.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OptionsController {

    @Autowired
    OptionsService os;
    @RequestMapping("queryoByzid")
    public List<Options> queryoByzid(@RequestParam("zid")Integer zid){

        return os.queryoByzid(zid);
    }
    @RequestMapping("updateByoid")
    public int updateByoid(Integer oid){

        Float a=1f;

        return os.updateByoid(oid);
    }


    @RequestMapping("baifenbi")
    public List<Float> baifenbi(@RequestParam("zid") Integer zid){

       return  os.baifenbi(zid);
    }
}
