package com.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.OrdersForChildTableMapper;
import com.domain.OrdersForChildTable;
import com.service.OrdersForChildTableService;

import java.util.List;

/**
 * @author xinting
 * @date 2021/2/25
 */
@Service
public class OrdersForChildTableServiceImpl implements OrdersForChildTableService {

    @Resource
    private OrdersForChildTableMapper ordersForChildTableMapper;

    @Override
    public int deleteByPrimaryKey(Integer orderitemid) {
        return ordersForChildTableMapper.deleteByPrimaryKey(orderitemid);
    }

    @Override
    public int insert(OrdersForChildTable record) {
        return ordersForChildTableMapper.insert(record);
    }

    @Override
    public int insertSelective(OrdersForChildTable record) {
        return ordersForChildTableMapper.insertSelective(record);
    }

    @Override
    public OrdersForChildTable selectByPrimaryKey(Integer orderitemid) {
        return ordersForChildTableMapper.selectByPrimaryKey(orderitemid);
    }

    @Override
    public int updateByPrimaryKeySelective(OrdersForChildTable record) {
        return ordersForChildTableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrdersForChildTable record) {
        return ordersForChildTableMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<OrdersForChildTable> querychild(Integer orderid) {
        return ordersForChildTableMapper.querychild(orderid);
    }
}

