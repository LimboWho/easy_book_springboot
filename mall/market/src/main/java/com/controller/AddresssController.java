package com.controller;

import com.config.UserLoginToken;
import com.domain.Address;
import com.domain.UsersTable;
import com.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xinting
 * @date 2021/2/27
 */
@RestController
@RequestMapping("api/address")
public class AddresssController {
    @Autowired
    private AddressService addressService;

    /**
     * 根据用户id查询地址
     * @param userid
     * @return
     */
    @RequestMapping("query")
    @UserLoginToken
    public Map<String,List<Address>> queryAddress(String userid){
        List<Address> addresses = addressService.selectByUserID(userid);
        Map<String,List<Address>> res=new HashMap<>();
        res.put("data",addresses);
        return res;
    }

    /**
     * 传过来一个地址对象修改地址
     * @param address
     * @return
     */
    @RequestMapping("update")
    @UserLoginToken
    public Map<String,String> updateAddress(@RequestBody Address address){
        Integer i = addressService.updateByPrimaryKey(address);
        Map<String,String> res = new HashMap<>();
        res.put("code",i.toString());
        return res;
    }

    /**
     * 传过来一个地址对象添加地址
     * @param address
     * @return
     */
    @RequestMapping("add")
    @UserLoginToken
    public Map<String,String> addAddress(@RequestBody Address address){
        Integer i = addressService.insert(address);
        Map<String,String> res = new HashMap<>();
        res.put("code",i.toString());
        return res;
    }

    /**
     * 根据地址id查询地址
     * @param AddressId
     * @return
     */
    @RequestMapping("delete")
    @UserLoginToken
    public Map<String,Integer> deleteAddress(int AddressId){
        int i = addressService.deleteByPrimaryKey(AddressId);
        Map<String,Integer> res = new HashMap<>();
        res.put("code",i);
        return res;
    }

    @RequestMapping("getDefaultAddress")
    @ResponseBody
    public Map<String,Object> getDefaultAddress(String UserId){
        Address address = addressService.getDefaultAddress(UserId);
        Map<String,Object> res=new HashMap<>();
        res.put("address",address);
        return res;
    }


    @RequestMapping("setDefaultAddress")
    @ResponseBody
    public Map<String,String> setDefaultAddress(Integer AddressId,String UserId){
        Integer def = addressService.setDefaultAddress(AddressId,UserId);
        Map<String,String> res=new HashMap<>();
        res.put("code",def.toString());
        return res;
    }

}
