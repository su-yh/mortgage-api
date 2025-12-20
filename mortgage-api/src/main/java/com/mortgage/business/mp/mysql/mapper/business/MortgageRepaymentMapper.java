package com.mortgage.business.mp.mysql.mapper.business;

import com.base.mp.mybatis.BaseMapperX;
import com.base.mp.mybatis.LambdaQueryWrapperX;
import com.base.mp.mybatis.PageParam;
import com.base.mp.mybatis.PageResult;
import com.mortgage.business.mp.mysql.entity.business.MortgageRepaymentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author suyh
 * @since 2025-12-20
 */
@Mapper
public interface MortgageRepaymentMapper extends BaseMapperX<MortgageRepaymentEntity> {
    default PageResult<MortgageRepaymentEntity> pageList(PageParam pageParam, Long userId){
        if (userId == null) {
            return PageResult.empty();
        }

        LambdaQueryWrapperX<MortgageRepaymentEntity> queryWrapperX = build();
        queryWrapperX.eqIfPresent(MortgageRepaymentEntity::getUserId, userId);

        return selectPage(pageParam, queryWrapperX);
    }
}
