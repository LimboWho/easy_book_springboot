package com.service;

import com.domain.MerchantsTable;
import com.domain.UsersTable;

/**
 * @author xinting
 * @date 2021/2/25
 */
public interface MerchantsTableService {


    int deleteByPrimaryKey(Integer merchantsid);

    int insert(MerchantsTable record);

    int insertSelective(MerchantsTable record);

    MerchantsTable selectByPrimaryKey(Integer merchantsid);

    int updateByPrimaryKeySelective(MerchantsTable record);

    int updateByPrimaryKey(MerchantsTable record);

   MerchantsTable check(String loginname, String passwordmd5);

}

