package com.mortgage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author suyh
 * @since 2023-11-26
 */
@SpringBootApplication
public class MortgageApplication {
    public static void main(String[] args) {
        // TODO: suyh - 有报错暂时行关掉
        // MybatisSqlDetailText.rebuildSqlDetail();
        SpringApplication.run(MortgageApplication.class, args);
    }
}
