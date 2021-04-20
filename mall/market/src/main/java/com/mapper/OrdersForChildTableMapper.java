package com.mapper;

import com.domain.OrdersForChildTable;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/27
 */
public interface OrdersForChildTableMapper {
    int deleteByPrimaryKey(Integer orderitemid);

    int insert(OrdersForChildTable record);

    int insertSelective(OrdersForChildTable record);

    OrdersForChildTable selectByPrimaryKey(Integer orderitemid);

    int updateByPrimaryKeySelective(OrdersForChildTable record);

    int updateByPrimaryKey(OrdersForChildTable record);

    List<OrdersForChildTable> querychild(Integer orderid);
}