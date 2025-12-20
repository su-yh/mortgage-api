package com.mortgage.system.service;

import com.base.mp.mybatis.PageParam;
import com.base.mp.mybatis.PageResult;
import com.mortgage.rouyi.entity.SysUserEntity;
import com.mortgage.system.dto.rsp.UserRspDto;
import com.web.sys.service.IUserService;

public interface IMortgageUserService extends IUserService {
    PageResult<UserRspDto> listPage(PageParam pageParam, String nameLike);

    void updateUser(SysUserEntity entity);

    void deleteUser(Long id);
}
