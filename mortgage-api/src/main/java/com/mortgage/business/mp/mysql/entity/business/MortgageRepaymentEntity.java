package com.mortgage.business.mp.mysql.entity.business;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author suyh
 * @since 2025-12-20
 */
@Data
@TableName(value = "mortgage_repayment", autoResultMap = true)
public class MortgageRepaymentEntity {

    @TableId(value = "id", type = IdType.AUTO)
    @Schema(description = "主键ID")
    private Long id;

    private Long userId;

    @TableField(value = "user_nick_name")
    private String userNickName;

    @TableField(value = "loan_type")
    @Schema(description = "贷款类型：1-公积金贷款 2-商业贷款 3-组合贷款")
    private Integer loanType;

    @TableField(value = "repayment_period")
    @Schema(description = "还款期数")
    private Integer repaymentPeriod;

    @TableField(value = "actual_repayment_date")
    @Schema(description = "实际还款日期")
    private Integer actualRepaymentDate;

    @TableField(value = "actual_principal")
    @Schema(description = "实际还款本金")
    private BigDecimal actualPrincipal;

    @TableField(value = "actual_interest")
    @Schema(description = "实际还款利息")
    private BigDecimal actualInterest;

    @TableField(value = "actual_overdue_fee")
    @Schema(description = "实际支付的逾期费用")
    private BigDecimal actualOverdueFee;

    @TableField(value = "actual_total")
    @Schema(description = "实际还款总金额（自动计算）")
    private BigDecimal actualTotal;

    @TableField(value = "remaining_loan_amount")
    @Schema(description = "还款后当前剩余贷款本金金额")
    private BigDecimal remainingLoanAmount;

    @TableField(value = "payment_method")
    @Schema(description = "还款方式：银行卡、支付宝、微信等")
    private String paymentMethod;

    @TableField(value = "payment_no")
    @Schema(description = "支付单号/银行流水号")
    private String paymentNo;

    @TableField(value = "actual_LPR")
    @Schema(description = "当前实际使用的贷款利率百分比，如：3.5%")
    private BigDecimal actualLPR;

    @TableField(value = "actual_BP")
    @Schema(description = "当前实际使用的基点，如：-30‱")
    private BigDecimal actualBP;

    @TableField(value = "realtime_LPR")
    @Schema(description = "当前实时的贷款利率百分比，如：3.5%")
    private BigDecimal realtimeLPR;

    @TableField(value = "realtime_BP")
    @Schema(description = "当前实时的基点，如：-30‱")
    private BigDecimal realtimeBP;

    @TableField(value = "remark")
    @Schema(description = "备注（如：提前还款、组合贷公积金部分等）")
    private String remark;

    @TableField(value = "created")
    @Schema(description = "记录创建时间")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Date created;

    @TableField(value = "updated")
    @Schema(description = "记录更新时间")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Date updated;
}
