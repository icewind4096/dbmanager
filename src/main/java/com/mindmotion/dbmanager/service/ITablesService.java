package com.mindmotion.dbmanager.service;

import com.mindmotion.dbmanager.dto.TablesDTO;

import java.util.List;

/**
 * Created by MMNJ002 on 2019/12/19.
 */
public interface ITablesService {
    //新建Tables记录
    Integer create(TablesDTO tablesDTO);

    //修改Tables记录
    TablesDTO update(TablesDTO tablesDTO);

    //删除Tables记录With 账册 表名
    TablesDTO delete(TablesDTO tablesDTO);

    //查询单条记录With 账册 表名
    TablesDTO findByAccountAndTableName(String account, String tableName);

    //查询多条记录With 账册
    List<TablesDTO> findByAccount(String account);
}
