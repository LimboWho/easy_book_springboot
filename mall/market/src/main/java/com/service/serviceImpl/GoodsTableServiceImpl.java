package com.service.serviceImpl;

import com.domain.CatalogueOfGoods;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.GoodsTableMapper;
import com.domain.GoodsTable;
import com.service.GoodsTableService;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/25
 */
@Service
public class GoodsTableServiceImpl implements GoodsTableService {

    @Resource
    private GoodsTableMapper goodsTableMapper;

    @Override
    public int deleteByPrimaryKey(Integer goodsid) {
        return goodsTableMapper.deleteByPrimaryKey(goodsid);
    }

    @Override
    public int insert(GoodsTable record) {
        return goodsTableMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsTable record) {
        return goodsTableMapper.insertSelective(record);
    }

    @Override
    public GoodsTable selectByPrimaryKey(Integer goodsid) {
        return goodsTableMapper.selectByPrimaryKey(goodsid);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsTable record) {
        return goodsTableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsTable record) {
        return goodsTableMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<GoodsTable> list() {
        return goodsTableMapper.list();
    }

    @Override
    public List<GoodsTable> allowlist() {
        return goodsTableMapper.allowlist();
    }

    @Override
    public List<GoodsTable> notallowlist() {
        return goodsTableMapper.notallowlist();
    }

    @Override
    public List<GoodsTable> queryByType(Integer typeid) {
        return goodsTableMapper.queryByType(typeid);
    }

    @Override
    public List<GoodsTable> queryByTypeUser(String CreateUser) {
        return goodsTableMapper.queryByTypeUser(CreateUser);
    }


    @Override
    public List<GoodsTable> random(Integer number) {
        return goodsTableMapper.random(number);
    }

    @Override
    public List<GoodsTable> search(String str) {
        return goodsTableMapper.search(str);
    }

    @Override
    public List<GoodsTable> selectByGoodsID(String userid) {
        return goodsTableMapper.selectByGoodsID(userid);
    }

}

