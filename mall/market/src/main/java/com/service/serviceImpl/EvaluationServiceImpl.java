package com.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.Evaluation;
import com.mapper.EvaluationMapper;
import com.service.EvaluationService;
/**
 *  @author xinting
 *  @date 2021/2/27
 */
@Service
public class EvaluationServiceImpl implements EvaluationService{

    @Resource
    private EvaluationMapper evaluationMapper;

    @Override
    public int deleteByPrimaryKey(Integer evaluationid) {
        return evaluationMapper.deleteByPrimaryKey(evaluationid);
    }

    @Override
    public int insert(Evaluation record) {
        return evaluationMapper.insert(record);
    }

    @Override
    public int insertSelective(Evaluation record) {
        return evaluationMapper.insertSelective(record);
    }

    @Override
    public Evaluation selectByPrimaryKey(Integer evaluationid) {
        return evaluationMapper.selectByPrimaryKey(evaluationid);
    }

    @Override
    public int updateByPrimaryKeySelective(Evaluation record) {
        return evaluationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Evaluation record) {
        return evaluationMapper.updateByPrimaryKey(record);
    }

}
