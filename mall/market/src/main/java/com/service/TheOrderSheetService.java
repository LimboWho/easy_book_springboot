package com.service;

import com.domain.TheOrderSheet;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/25
 */
public interface TheOrderSheetService {


    int deleteByPrimaryKey(Integer orderid);

    int insert(TheOrderSheet record);

    int insertSelective(TheOrderSheet record);

    List<TheOrderSheet> selectByUserID(String userid);

    int updateByPrimaryKeySelective(TheOrderSheet record);

    int updateByPrimaryKey(TheOrderSheet record);

    TheOrderSheet getLastOne();

}

