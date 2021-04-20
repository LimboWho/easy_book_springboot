package com.mapper;

import com.domain.Address;
import com.domain.GoodsTable;
import com.domain.TheCartTable;
import com.domain.TheOrderSheet;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/27
 */
public interface TheCartTableMapper {
    int deleteByPrimaryKey(Integer cartitemid);

    int insert(TheCartTable record);

    int insertSelective(TheCartTable record);

    TheCartTable selectByPrimaryKey(Integer cartitemid);

    int updateByPrimaryKeySelective(TheCartTable record);

    int updateByPrimaryKey(TheCartTable record);

    List<TheCartTable> selectByUserID(String userid);


}