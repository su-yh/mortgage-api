package com.mortgage.business.mp.mysql.mapper.business;

import com.base.mp.mybatis.BaseMapperX;
import com.base.mp.mybatis.LambdaQueryWrapperX;
import com.base.mp.mybatis.PageParam;
import com.base.mp.mybatis.PageResult;
import com.mortgage.business.dto.mortgage.MortgageStatisticsDetailDto;
import com.mortgage.business.mp.mysql.entity.business.MortgageRepaymentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

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

        queryWrapperX.orderByDesc(MortgageRepaymentEntity::getCreated, MortgageRepaymentEntity::getId);

        return selectPage(pageParam, queryWrapperX);
    }

    @Select("SELECT count(1) AS repayment_period, SUM(actual_principal) AS actual_principal, \n" +
            "  SUM(actual_interest) AS actual_interest, sum(actual_total) as actual_total, \n" +
            "  0 AS remaining_loan_amount\n" +
            "FROM mortgage_repayment\n" +
            "WHERE user_id = #{userId} AND loan_type = #{loanType}")
    MortgageStatisticsDetailDto selectStatistics(@Param("userId") Long userId, @Param("loanType") Integer loanType);
}
