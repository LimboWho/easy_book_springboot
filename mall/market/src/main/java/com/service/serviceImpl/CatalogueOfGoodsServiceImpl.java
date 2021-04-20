package com.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.CatalogueOfGoods;
import com.mapper.CatalogueOfGoodsMapper;
import com.service.CatalogueOfGoodsService;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/25
 */
@Service
public class CatalogueOfGoodsServiceImpl implements CatalogueOfGoodsService {

    @Resource
    private CatalogueOfGoodsMapper catalogueOfGoodsMapper;

    @Override
    public int deleteByPrimaryKey(Integer categoryid) {
        return catalogueOfGoodsMapper.deleteByPrimaryKey(categoryid);
    }

    @Override
    public int insert(CatalogueOfGoods record) {
        return catalogueOfGoodsMapper.insert(record);
    }

    @Override
    public int insertSelective(CatalogueOfGoods record) {
        return catalogueOfGoodsMapper.insertSelective(record);
    }

    @Override
    public CatalogueOfGoods selectByPrimaryKey(Integer categoryid) {
        return catalogueOfGoodsMapper.selectByPrimaryKey(categoryid);
    }

    @Override
    public int updateByPrimaryKeySelective(CatalogueOfGoods record) {
        return catalogueOfGoodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CatalogueOfGoods record) {
        return catalogueOfGoodsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<CatalogueOfGoods> list() {
        return catalogueOfGoodsMapper.list();
    }

}

