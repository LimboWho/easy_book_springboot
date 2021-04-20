package com.mapper;

import com.domain.CatalogueOfGoods;import java.util.List;

/**
 * @author xinting
 * @date 2021/2/27
 */
public interface CatalogueOfGoodsMapper {
    int deleteByPrimaryKey(Integer categoryid);

    int insert(CatalogueOfGoods record);

    int insertSelective(CatalogueOfGoods record);

    CatalogueOfGoods selectByPrimaryKey(Integer categoryid);

    int updateByPrimaryKeySelective(CatalogueOfGoods record);

    int updateByPrimaryKey(CatalogueOfGoods record);

    List<CatalogueOfGoods> list();
}