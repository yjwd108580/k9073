package com.hkk.piaoprovider.service;

import com.hkk.bean.Subject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectService {

    /**
     *增加主题
     * @param sb
     * @return
     */
    public int addSubject(Subject sb);


    /**
     * 全查主题表
     * @return
     */
    public List<Subject> queryAll();

    /**
     * 根据主题编号查询主题信息
     * @param zid
     * @return
     */
    public Subject queryByzid(Integer zid);

    /**
     * 根据subject主键修改投票人数
     * @param
     * @return
     */
    public int updatetotalvotes(@Param("zid") Integer zid);

    /**
     * 根据subject主键修改查看次数
     * @param zid
     * @param
     * @return
     */
    public int updateviewtimes(@Param("zid") Integer zid);
}
