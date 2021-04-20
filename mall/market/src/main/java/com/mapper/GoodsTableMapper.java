package com.mapper;

import com.domain.CatalogueOfGoods;
import com.domain.GoodsTable;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/27
 */
public interface GoodsTableMapper {
    int deleteByPrimaryKey(Integer goodsid);

    int insert(GoodsTable record);

    int insertSelective(GoodsTable record);

    GoodsTable selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(GoodsTable record);

    int updateByPrimaryKey(GoodsTable record);

    List<GoodsTable> list();

    List<GoodsTable> queryByType(Integer typeId);

    List<GoodsTable> queryByTypeUser(String  CreateUser);

    List<GoodsTable> random(Integer number);

    List<GoodsTable> search(String str);

    List<GoodsTable> selectByGoodsID(String userid);
}