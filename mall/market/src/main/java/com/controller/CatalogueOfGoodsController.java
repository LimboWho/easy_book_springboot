package com.controller;

import com.common.vo.DataGridView;
import com.config.UserLoginToken;
import com.domain.CatalogueOfGoods;
import com.service.CatalogueOfGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author xinting
 * @date 2021/2/25
 * 商品分类
 */
@RestController
@RequestMapping("api/catalogue")
public class CatalogueOfGoodsController {

    @Autowired
    private CatalogueOfGoodsService catalogueOfGoodsService;

    /**
     * 返回所有分类
     * @return
     */
    @RequestMapping("list")
//    @UserLoginToken
    public HashMap<String, List<CatalogueOfGoods>> list(){
        HashMap<String, List<CatalogueOfGoods>> map = new HashMap<>();
        map.put("data",catalogueOfGoodsService.list());
        //HashMap<String, HashMap<String, HashMap<String, List<CatalogueOfGoods>>>> map1 = new HashMap<>();
        //HashMap<String, HashMap<String,List<CatalogueOfGoods>>> map2 = new HashMap<>();
        //HashMap<String, List<CatalogueOfGoods>> map3 = new HashMap<>();
        //new CatalogueOfGoods(1,"1",0,"手机",1);
        return map;
    }

}

