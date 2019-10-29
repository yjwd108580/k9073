package com.hkk.piaoprovider.impl;

import com.hkk.bean.Subject;
import com.hkk.piaoprovider.dao.SubjectDao;
import com.hkk.piaoprovider.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {
@Autowired
SubjectDao sd;
    @Override
    public int addSubject(Subject sb) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd ");
        String createdate=df.format(new Date());
        sb.setCreatedate(createdate);
        sb.setTotalvotes(0);
        sb.setViewtimes(0);
        return sd.addSubject(sb);
    }

    @Override
    public List<Subject> queryAll() {
        return sd.queryAll();
    }

    @Override
    public Subject queryByzid(Integer zid) {
        return sd.queryByzid(zid);
    }

    @Override
    public int updatetotalvotes(Integer zid) {
        return sd.updatetotalvotes(zid);
    }

    @Override
    public int updateviewtimes(Integer zid) {
        return sd.updateviewtimes(zid);
    }


}
