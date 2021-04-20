package com.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.config.UserLoginToken;
import com.domain.*;
import com.service.GoodsTableService;
import com.service.OrdersForChildTableService;
import com.service.TheCartTableService;
import com.service.TheOrderSheetService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author xinting
 * @date 2021/2/25
 * 订单
 */
@RestController
@RequestMapping("api/order")
public class TheOrderSheetController {
    @Autowired
    private TheOrderSheetService theOrderSheetService;
    @Autowired
    private OrdersForChildTableService ordersForChildTableService;
    @Autowired
    private GoodsTableService goodsTableServicel;
    /**
     * 根据订单id查询完整订单及其子订单
     * @param userid
     * @return
     */
    @RequestMapping("query")
    @UserLoginToken
    public Map<String, Object> query(String userid){
//        TheOrderSheet theOrderSheet = theOrderSheetService.selectByPrimaryKey(orderId);
        List<TheOrderSheet> theOrderSheet = theOrderSheetService.selectByUserID(userid);

        List<TheOrderSheet_2> theOrderSheet2=new ArrayList<>();

        for(TheOrderSheet order:theOrderSheet){
            TheOrderSheet_2 theOrderSheet_2 = new TheOrderSheet_2();
            List<OrdersForChildTable_2> ordersForChildTable2=new ArrayList<>();
            BeanUtils.copyProperties(order,theOrderSheet_2);
            Integer orderid = order.getOrderid();
            List<OrdersForChildTable> querychild = ordersForChildTableService.querychild(orderid);
            for(OrdersForChildTable oderChild:querychild){
                OrdersForChildTable_2 ordersForChildTable_2 =new OrdersForChildTable_2();
                BeanUtils.copyProperties(oderChild,ordersForChildTable_2);
                Integer goodid=oderChild.getGoodsid();
                GoodsTable goodsTables = goodsTableServicel.selectByPrimaryKey(goodid);
                ordersForChildTable_2.setGoods(goodsTables);
                ordersForChildTable2.add(ordersForChildTable_2);
            }
            theOrderSheet_2.setChild(ordersForChildTable2);
            theOrderSheet2.add(theOrderSheet_2);
        }
//        List<OrdersForChildTable> querychild = ordersForChildTableService.querychild(orderid);


        Map<String,Object> res=new HashMap<>();

        res.put("data",theOrderSheet2);
        return res;

    }

    /**
     * 新建订单
     * @param parms
     * @return
     */
    @RequestMapping("create")
    @UserLoginToken
    public Map<String, Object> query(@RequestBody Map<String,Object> parms){
        Map<String, Object> res = new HashMap<>();
        Map<String,String> map1 = (Map) parms.get("parent");
        TheOrderSheet lastOne = null;
        List<Map<String,String>> listchild = (ArrayList<Map<String,String>>) parms.get("child");
        System.out.println(listchild);
        System.out.println(parms);
        if (map1.equals(null)){
            res.put("code","0");
            res.put("parentnum","0");
        }
        else{

            TheOrderSheet parent = JSONObject.parseObject(JSON.toJSONString(map1), TheOrderSheet.class);
            int parentnum = theOrderSheetService.insert(parent);
            lastOne=theOrderSheetService.getLastOne();
            res.put("code","200");
            res.put("orderId",lastOne.getOrderid());
        }

        if (listchild.equals(null)){
            res.put("code","0");
            res.put("childnum","0");

        }
        else{
            int num=0;
            for (Map<String,String> childstr:listchild){

                childstr.put("orderid",lastOne.getOrderid().toString());
                OrdersForChildTable child = JSON.parseObject(JSONObject.toJSONString(childstr), OrdersForChildTable.class);
                int insert = ordersForChildTableService.insert(child);
                num++;
            }


            res.put("code","200");
            res.put("childnum",num);
        }

        return res;

    }

    /**
     * 更新订单状态
     * @param orderSheet
     * @return
     */
    @RequestMapping("update")
    @UserLoginToken
    public Map<String,String> updateTheCartTable(@RequestBody TheOrderSheet orderSheet){
        Integer i = theOrderSheetService.updateByPrimaryKey(orderSheet);
        Map<String,String> res = new HashMap<>();
        res.put("code",i.toString());
        return res;
    }

}
