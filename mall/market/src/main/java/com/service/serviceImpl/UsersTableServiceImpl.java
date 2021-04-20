package com.service.serviceImpl;

import com.domain.Address;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.UsersTable;
import com.mapper.UsersTableMapper;
import com.service.UsersTableService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *  @author xinting
 *  @date 2021/2/27
 */
@Service
public class UsersTableServiceImpl implements UsersTableService{

    @Resource
    private UsersTableMapper usersTableMapper;

    @Override
    public int deleteByPrimaryKey(String userid) {
        return usersTableMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(UsersTable record) {
        return usersTableMapper.insert(record);
    }

    @Override
    public int insertSelective(UsersTable record) {
        return usersTableMapper.insertSelective(record);
    }

    @Override
    public UsersTable selectByPrimaryKey(String userid) {
        return usersTableMapper.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByPrimaryKeySelective(UsersTable record) {
        return usersTableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UsersTable record) {
        return usersTableMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<UsersTable> getUserList(Map<String, Object> params) {
        String username=(String) params.get("loginusername");
        UsersTable user = usersTableMapper.selectByUsername(username);
        List<UsersTable> users=new ArrayList<>();
        if (user!=null) users.add(user);
        return users;
    }

    @Override
    public Boolean login(Map<String, Object> params, UsersTable usersTable) {
        if (params.size()>0 && usersTable.getLoginpassword().equals(params.get("loginpassword")))return true;
        else return false;
    }





}
