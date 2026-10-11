
ALTER TABLE mortgage_repayment ADD COLUMN `is_prepay` tinyint(1)          DEFAULT 0 COMMENT '是否提前还款';
ALTER TABLE mortgage_repayment ADD COLUMN `actual_rate` decimal(5, 1) COMMENT '实际利息';
ALTER TABLE mortgage_repayment DROP `actual_total`;
ALTER TABLE mortgage_repayment DROP `actual_LPR`;
ALTER TABLE mortgage_repayment DROP `actual_BP`;


