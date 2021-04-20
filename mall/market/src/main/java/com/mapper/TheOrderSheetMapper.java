package com.mapper;

import com.domain.OrdersForChildTable;
import com.domain.TheOrderSheet;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/27
 */
public interface TheOrderSheetMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(TheOrderSheet record);

    int insertSelective(TheOrderSheet record);

//    TheOrderSheet selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(TheOrderSheet record);

    int updateByPrimaryKey(TheOrderSheet record);

    List<TheOrderSheet> selectByUserID(String userid);

    TheOrderSheet getLastOne();
}