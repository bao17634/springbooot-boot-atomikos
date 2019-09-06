package com.gitee.taven.utils;


import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.provider.base.BaseInsertProvider;

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>,ExampleMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
    @Override
    @InsertProvider(
            type = BaseInsertProvider.class,
            method = "dynamicSQL"
    )
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insert(T var1);
}
