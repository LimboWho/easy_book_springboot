package com.service;

import com.domain.GoodsTable;
import com.domain.TheCartTable;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/25
 */
public interface TheCartTableService {


    int deleteByPrimaryKey(Integer cartitemid);

    int insert(TheCartTable record);

    int insertSelective(TheCartTable record);

    TheCartTable selectByPrimaryKey(Integer cartitemid);

    int updateByPrimaryKeySelective(TheCartTable record);

    int updateByPrimaryKey(TheCartTable record);

    List<TheCartTable> selectByUserID(String userid);


}

