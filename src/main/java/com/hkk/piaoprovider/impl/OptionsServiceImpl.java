package com.hkk.piaoprovider.impl;

import com.hkk.bean.Options;
import com.hkk.bean.Subject;
import com.hkk.piaoprovider.dao.OptionsDao;
import com.hkk.piaoprovider.dao.SubjectDao;
import com.hkk.piaoprovider.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OptionsServiceImpl implements OptionsService {
   @Autowired
    OptionsDao od;
   @Autowired
   SubjectDao sd;
    @Override
    public List<Options> queryoByzid(Integer zid) {
        return od.queryoByzid(zid);
    }

    @Override
    public int updateByoid(Integer oid) {
        return od.updateByoid(oid);
    }

    @Override
    public List<Float> baifenbi(Integer zid) {

        List<Options> list=od.queryoByzid(zid);

        Subject s=sd.queryByzid(zid);
        List<Float> list1=new ArrayList<Float>();
        for(Options o:list){
           float a=o.getVote();
           float b=s.getTotalvotes();
           float c=((a/b)*100);

            System.out.println(o.getVote()+"============================");
            System.out.println(s.getTotalvotes()+"============");
            System.out.println(c+"===========================");
            list1.add(c);
        }
        return list1;
    }
}
