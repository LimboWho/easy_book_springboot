package com.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.AddressMapper;
import com.domain.Address;
import com.service.AddressService;

import java.util.List;

/**
 *  @author xinting
 *  @date 2021/2/27
 */
@Service
public class AddressServiceImpl implements AddressService{

    @Resource
    private AddressMapper addressMapper;

    @Override
    public int deleteByPrimaryKey(Integer addressid) {
        return addressMapper.deleteByPrimaryKey(addressid);
    }

    @Override
    public int insert(Address record) {
        return addressMapper.insert(record);
    }

    @Override
    public int insertSelective(Address record) {
        return addressMapper.insertSelective(record);
    }

    @Override
    public List<Address> selectByUserID(String userid) {
        return addressMapper.selectByUserID(userid);
    }


    @Override
    public int updateByPrimaryKeySelective(Address record) {
        return addressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Address record) {
        return addressMapper.updateByPrimaryKey(record);
    }

    @Override
    public Address getDefaultAddress(String userId) {
        Address defaultAddress = addressMapper.getDefaultAddress(userId);
        return defaultAddress;
    }

    @Override
    public Integer setDefaultAddress(Integer addressId, String userId) {
        return addressMapper.setDefaultAddress(addressId,userId);
    }

}
