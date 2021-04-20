package com.controller;

import com.config.UserLoginToken;
import com.domain.Address;
import com.domain.CatalogueOfGoods;
import com.domain.GoodsTable;
import com.service.GoodsTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xinting
 * @date 2021/2/25
 * 货物
 */
@RestController
@RequestMapping("api/goods")
public class GoodsController {
    @Autowired
    GoodsTableService goodsTableService;

    /**
     * 返回所有货物
     * @return
     */
    @RequestMapping("list")
//    @UserLoginToken
    public HashMap<String, List<GoodsTable>> list(){
        HashMap<String, List<GoodsTable>> map = new HashMap<>();
        map.put("data",goodsTableService.list());
        return map;
    }

    /**
     * 根据id查询货物
     * @param id
     * @return
     */
    @RequestMapping("queryByID")
//    @UserLoginToken
    public HashMap<String, GoodsTable> queryByID(Integer id){
        GoodsTable goodsTable = goodsTableService.selectByPrimaryKey(id);
        HashMap<String, GoodsTable> res = new HashMap<String, GoodsTable>();
        res.put("data",goodsTable);
        return res;
    }

    /**
     * 根据商品类型id返回类别商品
     * @param typeId
     * @return
     */
    @RequestMapping("queryByTypeID")
//    @UserLoginToken
    public HashMap<String, List<GoodsTable>> queryByTypeID(Integer typeId){
        List<GoodsTable> goodsTables = goodsTableService.queryByType(typeId);
        HashMap<String, List<GoodsTable>> res = new HashMap<>();
        res.put("data",goodsTables);
        return res;
    }



    /**
     * 根据创建人返回类别商品
     * @param CreateUser
     * @return
     */
    @RequestMapping("queryByTypeUser")
//    @UserLoginToken
    public HashMap<String, List<GoodsTable>> queryByTypeUser(String CreateUser){
        List<GoodsTable> goodsTables = goodsTableService.queryByTypeUser(CreateUser);
        HashMap<String, List<GoodsTable>> res = new HashMap<>();
        res.put("data",goodsTables);
        return res;
    }



    /**
     * 传过来一个商品对象进行更新
     * @param goodsTable
     * @return
     */
    @RequestMapping("update")
//    @UserLoginToken
    public Map<String,String> updateGood(@RequestBody GoodsTable goodsTable){
        Integer i = goodsTableService.updateByPrimaryKey(goodsTable);
        Map<String,String> res = new HashMap<>();
        res.put("code",i.toString());
        return res;
    }

    /**
     * 传过来一个对象进行添加商品
     * @param goodsTable
     * @return
     */
    @RequestMapping(value = "add")
    @UserLoginToken
    public Map<String,String> addGood(@RequestBody GoodsTable goodsTable){
        Integer i = goodsTableService.insert(goodsTable);
        Map<String,String> res = new HashMap<>();
        res.put("code",i.toString());
        return res;
    }

    /**
     * 传过来指定的
     * @param number
     * @return
     */
    @RequestMapping(value = "random")
//    @UserLoginToken
    public HashMap<String, List<GoodsTable>> random(Integer number){
        List<GoodsTable> goodsTables = goodsTableService.random(number);
        HashMap<String, List<GoodsTable>> res = new HashMap<>();
        res.put("data",goodsTables);
        return res;
    }

    /**
     * 模糊匹配查询
     * @param str
     * @return
     */
    @RequestMapping(value = "search")
//    @UserLoginToken
    public HashMap<String, List<GoodsTable>> search(String str){
        List<GoodsTable> goodsTables = goodsTableService.search(str);
        HashMap<String, List<GoodsTable>> res = new HashMap<>();
        res.put("data",goodsTables);
        return res;
    }
}
