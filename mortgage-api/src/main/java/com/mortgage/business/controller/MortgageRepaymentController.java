package com.mortgage.business.controller;

import com.base.mp.mybatis.PageParam;
import com.base.mp.mybatis.PageResult;
import com.mortgage.business.mp.mysql.entity.business.MortgageRepaymentEntity;
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
@Tag(name = "MortgageRepayment")
@RestController
@RequestMapping("/mortgage/repayment")
@RequiredArgsConstructor
@Validated
@Slf4j
public class MortgageRepaymentController {
    private final MortgageRepaymentService mortgageRepaymentService;

    @Operation(summary = "【分页查询】查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public PageResult<MortgageRepaymentEntity> pageList(
            @Parameter(hidden = true) @CurrLoginUser LoginUser loginUser,
            @Validated PageParam pageParam) {
        return mortgageRepaymentService.pageList(pageParam, loginUser.getId());
    }
}
