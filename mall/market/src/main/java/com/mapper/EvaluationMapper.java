package com.mapper;

import com.domain.Evaluation;

/**
 *  @author xinting
 *  @date 2021/2/27
 */
public interface EvaluationMapper {
    int deleteByPrimaryKey(Integer evaluationid);

    int insert(Evaluation record);

    int insertSelective(Evaluation record);

    Evaluation selectByPrimaryKey(Integer evaluationid);

    int updateByPrimaryKeySelective(Evaluation record);

    int updateByPrimaryKey(Evaluation record);
}