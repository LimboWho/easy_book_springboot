package com.service;

import com.domain.Address;
import com.domain.UsersTable;

import java.util.List;
import java.util.Map;

/**
 *  @author xinting
 *  @date 2021/2/27
 */
public interface UsersTableService{



    int deleteByPrimaryKey(String userid);

    int insert(UsersTable record);

    int insertSelective(UsersTable record);

    UsersTable selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UsersTable record);

    int updateByPrimaryKey(UsersTable record);

    List<UsersTable> getUserList(Map<String, Object> params);

    Boolean login(Map<String, Object> params, UsersTable usersTable);



}
