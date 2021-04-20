package com.mapper;

import com.domain.Address;
import com.domain.UsersTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  @author xinting
 *  @date 2021/2/27
 */
public interface UsersTableMapper {
    int deleteByPrimaryKey(String userid);

    int insert(UsersTable record);

    int insertSelective(UsersTable record);

    UsersTable selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UsersTable record);

    int updateByPrimaryKey(UsersTable record);

    UsersTable selectByUsername(@Param("username") String username);



}