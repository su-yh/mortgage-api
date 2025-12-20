package com.mortgage.business.dto.mortgage;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author suyh
 * @since 2025-12-21
 */
@Data
public class MortgageStatisticsDetailDto {
    @Schema(description = "还款期数")
    private Integer repaymentPeriod;
    @Schema(description = "实际还款本金")
    private BigDecimal actualPrincipal;
    @Schema(description = "实际还款利息")
    private BigDecimal actualInterest;
    @Schema(description = "实际还款总金额")
    private BigDecimal actualTotal;
    @Schema(description = "还款后当前剩余贷款本金金额")
    private BigDecimal remainingLoanAmount;
}
