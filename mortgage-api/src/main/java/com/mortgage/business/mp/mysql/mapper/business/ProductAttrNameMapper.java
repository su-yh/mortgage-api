package com.mortgage.business.mp.mysql.mapper.business;

import com.base.mp.mybatis.BaseMapperX;
import com.base.mp.mybatis.LambdaQueryWrapperX;
import com.mortgage.business.mp.mysql.entity.business.ProductAttrNameEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.lang.Nullable;

import java.util.List;

@Mapper
public interface ProductAttrNameMapper extends BaseMapperX<ProductAttrNameEntity> {
    default List<ProductAttrNameEntity> selectListByCategoryId(@Nullable Long categoryId) {
        if (categoryId == null) {
            return null;
        }

        LambdaQueryWrapperX<ProductAttrNameEntity> queryWrapperX = build();
        queryWrapperX.eq(ProductAttrNameEntity::getCategoryId, categoryId);

        return selectList(queryWrapperX);
    }
}
