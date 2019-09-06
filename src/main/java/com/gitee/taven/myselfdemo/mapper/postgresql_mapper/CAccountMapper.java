package com.gitee.taven.myselfdemo.mapper.postgresql_mapper;

import com.gitee.taven.myselfdemo.entity.CAccount;

import com.gitee.taven.utils.MyMapper;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.provider.base.BaseInsertProvider;

public interface CAccountMapper extends MyMapper<CAccount> {


}