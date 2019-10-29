package com.hkk.piaoprovider.service;

import com.hkk.bean.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OptionsService {

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

    /**
     * 求各项百分比
     * @param zid
     * @return
     */
    public List<Float> baifenbi(Integer zid);
}
