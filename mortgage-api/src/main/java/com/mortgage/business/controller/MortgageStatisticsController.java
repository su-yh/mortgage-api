package com.mortgage.business.controller;

import com.mortgage.business.dto.mortgage.MortgageStatisticsDto;
import com.mortgage.business.service.MortgageRepaymentService;
import com.web.sys.authentication.annotation.CurrLoginUser;
import com.web.sys.authentication.user.LoginUser;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suyh
 * @since 2025-12-20
 */
@Tag(name = "MortgageStatistics")
@RestController
@RequestMapping("/mortgage/statistics")
@RequiredArgsConstructor
@Validated
@Slf4j
public class MortgageStatisticsController {
    private final MortgageRepaymentService mortgageRepaymentService;

    @Operation(summary = "【分页查询】查询")
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public MortgageStatisticsDto statisticsQuery(
            @Parameter(hidden = true) @CurrLoginUser LoginUser loginUser) {
        return mortgageRepaymentService.statisticsQuery(loginUser.getId());
    }
}
