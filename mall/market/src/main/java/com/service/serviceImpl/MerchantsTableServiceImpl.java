package com.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.MerchantsTableMapper;
import com.domain.MerchantsTable;
import com.service.MerchantsTableService;

/**
 * @author xinting
 * @date 2021/2/25
 */
@Service
public class MerchantsTableServiceImpl implements MerchantsTableService {

    @Resource
    private MerchantsTableMapper merchantsTableMapper;

    @Override
    public int deleteByPrimaryKey(Integer merchantsid) {
        return merchantsTableMapper.deleteByPrimaryKey(merchantsid);
    }

    @Override
    public int insert(MerchantsTable record) {
        return merchantsTableMapper.insert(record);
    }

    @Override
    public int insertSelective(MerchantsTable record) {
        return merchantsTableMapper.insertSelective(record);
    }

    @Override
    public MerchantsTable selectByPrimaryKey(Integer merchantsid) {
        return merchantsTableMapper.selectByPrimaryKey(merchantsid);
    }

    @Override
    public int updateByPrimaryKeySelective(MerchantsTable record) {
        return merchantsTableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MerchantsTable record) {
        return merchantsTableMapper.updateByPrimaryKey(record);
    }

    @Override
    public MerchantsTable check(String loginname, String passwordmd5) {
        return merchantsTableMapper.check(loginname, passwordmd5);
    }

}

