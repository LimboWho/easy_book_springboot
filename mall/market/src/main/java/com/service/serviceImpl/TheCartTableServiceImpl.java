package com.service.serviceImpl;

import com.domain.GoodsTable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.TheCartTableMapper;
import com.domain.TheCartTable;
import com.service.TheCartTableService;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/25
 */
@Service
public class TheCartTableServiceImpl implements TheCartTableService {

    @Resource
    private TheCartTableMapper theCartTableMapper;

    @Override
    public int deleteByPrimaryKey(Integer cartitemid) {
        return theCartTableMapper.deleteByPrimaryKey(cartitemid);
    }

    @Override
    public int insert(TheCartTable record) {
        return theCartTableMapper.insert(record);
    }

    @Override
    public int insertSelective(TheCartTable record) {
        return theCartTableMapper.insertSelective(record);
    }

    @Override
    public TheCartTable selectByPrimaryKey(Integer cartitemid) {
        return theCartTableMapper.selectByPrimaryKey(cartitemid);
    }

    @Override
    public int updateByPrimaryKeySelective(TheCartTable record) {
        return theCartTableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TheCartTable record) {
        return theCartTableMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TheCartTable> selectByUserID(String userid) {
        return theCartTableMapper.selectByUserID(userid);
    }




}

