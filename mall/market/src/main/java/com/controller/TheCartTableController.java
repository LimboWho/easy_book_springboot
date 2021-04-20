package com.controller;

import com.config.UserLoginToken;
import com.domain.Address;
import com.domain.GoodsTable;
import com.domain.TheCartTable;
import com.domain.TheCartTable_2;
import com.service.AddressService;
import com.service.GoodsTableService;
import com.service.TheCartTableService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author xinting
 * @date 2021/2/25
 * 购物车
 */
@RestController
@RequestMapping("api/carttable")
public class TheCartTableController {

    @Autowired
    private TheCartTableService theCartTableService;
    @Autowired
    private GoodsTableService goodsTableServicel;

    /**
     * 根据用户id查询
     * @param userid
     * @return
     */
    @RequestMapping("query")
    @UserLoginToken
    public Map<String, Object> queryTheCartTable(String userid){
        List<TheCartTable> theCartTables = theCartTableService.selectByUserID(userid);
        List<GoodsTable> goodsTables = goodsTableServicel.selectByGoodsID(userid);
//        List<GoodsTable> goodsTables = goodsTableServicel.list();

        List<TheCartTable_2> theCartTables2 = new ArrayList<>();
        for(TheCartTable car:theCartTables){
            TheCartTable_2 theCartTable_2 = new TheCartTable_2();
            BeanUtils.copyProperties(car,theCartTable_2);
            for(GoodsTable goodsTable:goodsTables){
                if (goodsTable.getGoodsid().equals(car.getGoodsid())) {
                    theCartTable_2.setGoodstable(goodsTable);
                    theCartTables2.add(theCartTable_2);
                    break;
                }
            }
        }
        Map<String,Object> res=new HashMap<>();
        res.put("data",theCartTables2);
        return res;
    }

    /**
     * 传过来一个购物车对象进行修改
     * @param theCartTable
     * @return
     */
    @RequestMapping("update")
    @UserLoginToken
    public Map<String,String> updateTheCartTable(@RequestBody TheCartTable theCartTable){
        Integer i = theCartTableService.updateByPrimaryKey(theCartTable);
        Map<String,String> res = new HashMap<>();
        res.put("code",i.toString());
        return res;
    }

    /**
     * 传过来一个购物车对象进行添加
     * @param theCartTable
     * @return
     */
    @RequestMapping("add")
    @UserLoginToken
    public Map<String,String> addTheCartTable(@RequestBody TheCartTable theCartTable){
        Integer i = theCartTableService.insert(theCartTable);
        Map<String,String> res = new HashMap<>();
        res.put("code",i.toString());
        return res;
    }

    /**
     * 传过来一个购物车对象进行修改
     * @param theCartTableId
     * @return
     */
    @RequestMapping("delete")
    @UserLoginToken
    public Map<String,Integer> deleteTheCartTable(int theCartTableId){
        Integer i = theCartTableService.deleteByPrimaryKey(theCartTableId);
        Map<String,Integer> res = new HashMap<>();
        res.put("code",i);
        return res;
    }


}
