package com.service;

import com.domain.Address;

import java.util.List;

/**
 *  @author xinting
 *  @date 2021/2/27
 */
public interface AddressService{


    int deleteByPrimaryKey(Integer addressid);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByUserID(String userid);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    Address getDefaultAddress(String userId);

    Integer setDefaultAddress(Integer addressId, String userId);
}
