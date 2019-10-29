package com.hkk.piaoprovider.dao;

import com.hkk.bean.Options;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OptionsDao {

    /**
     * 根据zid查询指定主题所有选项信息
     * @param zid
     * @return
     */
    public List<Options> queryoByzid(Integer zid);


    /**
     * 修改指定选项的得票数
     * @param oid
     * @return
     */
    public int updateByoid(@Param("oid") Integer oid);



}
