package com.mortgage.system.dto.rsp;

import com.mortgage.rouyi.entity.SysRoleEntity;
import com.mortgage.rouyi.entity.SysUserEntity;
import lombok.Data;

import java.util.List;

@Data
public class UserRspDto {
    private SysUserEntity sysUserEntity;
    private List<SysRoleEntity> roleEntities;
}
