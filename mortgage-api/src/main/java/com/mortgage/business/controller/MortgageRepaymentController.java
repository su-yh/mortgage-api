package com.mortgage.business.controller;

import com.base.mp.mybatis.PageParam;
import com.base.mp.mybatis.PageResult;
import com.base.web.validation.groups.ValidationGroups;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.groups.Default;

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
    @RequestMapping(value = "/page/list", method = RequestMethod.GET)
    public PageResult<MortgageRepaymentEntity> pageList(
            @Parameter(hidden = true) @CurrLoginUser LoginUser loginUser,
            @Validated PageParam pageParam) {
        return mortgageRepaymentService.pageList(pageParam, loginUser.getId());
    }

    @Operation(summary = "新建")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Long create(
            @Parameter(hidden = true) @CurrLoginUser LoginUser loginUser,
            @Validated(value = {ValidationGroups.Req.Create.class, Default.class}) @RequestBody MortgageRepaymentEntity entity) {
        return mortgageRepaymentService.createEntity(entity, loginUser.getId(), loginUser.getNickname());
    }

    @Operation(summary = "编辑")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Long update(
            @Parameter(hidden = true) @CurrLoginUser LoginUser loginUser,
            @Validated(value = {ValidationGroups.Req.Update.class, Default.class}) @RequestBody MortgageRepaymentEntity entity) {
        return mortgageRepaymentService.updateEntity(entity, loginUser.getId(), loginUser.getNickname());
    }
}
