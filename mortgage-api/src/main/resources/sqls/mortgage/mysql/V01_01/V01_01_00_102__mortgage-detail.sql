
-- DROP TABLE IF EXISTS mortgage_detail;
CREATE TABLE mortgage_detail
(
    id bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID' PRIMARY KEY,
    total_amount decimal(18, 2) COMMENT '贷款总金额',
    dates INT COMMENT '贷款日期',
    user_id BIGINT COMMENT '所属用户',
    user_nick_name VARCHAR(64)
) ENGINE=InnoDB COMMENT='房贷详情表';
