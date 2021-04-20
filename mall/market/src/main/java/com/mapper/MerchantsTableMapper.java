package com.mapper;

import com.domain.MerchantsTable;
import org.apache.ibatis.annotations.Param;

/**
 * @author xinting
 * @date 2021/2/27
 */
public interface MerchantsTableMapper {
    int deleteByPrimaryKey(Integer merchantsid);

    int insert(MerchantsTable record);

    int insertSelective(MerchantsTable record);

    MerchantsTable selectByPrimaryKey(Integer merchantsid);

    int updateByPrimaryKeySelective(MerchantsTable record);

    int updateByPrimaryKey(MerchantsTable record);

    MerchantsTable check(@Param("loginname") String loginname, @Param("passwordmd5") String passwordmd5);
}