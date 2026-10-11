package com.mortgage;

import com.mortgage.bytecodes.MybatisSqlDetailText;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author suyh
 * @since 2023-11-26
 */
@SpringBootApplication
public class MortgageApplication {
    public static void main(String[] args) {
        MybatisSqlDetailText.rebuildSqlDetail();
        SpringApplication.run(MortgageApplication.class, args);
    }
}
