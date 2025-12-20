package com.mortgage.business.dto.mortgage;

import lombok.Data;

/**
 * @author suyh
 * @since 2025-12-21
 */
@Data
public class MortgageStatisticsDto {
    // 商业贷款
    private MortgageStatisticsDetailDto commercialDetail;
    // 公积金贷款
    private MortgageStatisticsDetailDto publicFundDetail;
}
