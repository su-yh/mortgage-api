package com.mortgage.business.service;

import com.base.mp.mybatis.PageParam;
import com.base.mp.mybatis.PageResult;
import com.mortgage.business.mp.mysql.entity.business.MortgageRepaymentEntity;
import com.mortgage.business.mp.mysql.mapper.business.MortgageRepaymentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

/**
 * @author suyh
 * @since 2025-12-20
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class MortgageRepaymentService {
    private final MortgageRepaymentMapper mortgageRepaymentMapper;

    public PageResult<MortgageRepaymentEntity> pageList(PageParam pageParam, @NonNull Long userId) {
        return mortgageRepaymentMapper.pageList(pageParam, userId);
    }

    public Long createEntity(MortgageRepaymentEntity entity, Long userId, String userNickName) {
        entity.setUserId(userId);
        entity.setUserNickName(userNickName);
        mortgageRepaymentMapper.insert(entity);
        return entity.getId();
    }

    public Long updateEntity(MortgageRepaymentEntity entity, Long userId, String userNickName) {
        entity.setUserId(userId);
        entity.setUserNickName(userNickName);
        mortgageRepaymentMapper.updateById(entity);
        return entity.getId();
    }
}
