package com.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.TheOrderSheetMapper;
import com.domain.TheOrderSheet;
import com.service.TheOrderSheetService;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/25
 */
@Service
public class TheOrderSheetServiceImpl implements TheOrderSheetService {

    @Resource
    private TheOrderSheetMapper theOrderSheetMapper;

    @Override
    public int deleteByPrimaryKey(Integer orderid) {
        return theOrderSheetMapper.deleteByPrimaryKey(orderid);
    }

    @Override
    public int insert(TheOrderSheet record) {
        return theOrderSheetMapper.insert(record);
    }

    @Override
    public int insertSelective(TheOrderSheet record) {
        return theOrderSheetMapper.insertSelective(record);
    }

    @Override
    public List<TheOrderSheet> selectByUserID(String userid) {
        return theOrderSheetMapper.selectByUserID(userid);
    }
//
//    @Override
//    public TheOrderSheet selectByPrimaryKey(Integer orderid) {
//        return theOrderSheetMapper.selectByPrimaryKey(orderid);
//    }

    @Override
    public int updateByPrimaryKeySelective(TheOrderSheet record) {
        return theOrderSheetMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TheOrderSheet record) {
        return theOrderSheetMapper.updateByPrimaryKey(record);
    }


    public  TheOrderSheet getLastOne(){return theOrderSheetMapper.getLastOne();}

}

