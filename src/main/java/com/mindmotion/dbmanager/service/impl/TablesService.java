package com.mindmotion.dbmanager.service.impl;

import com.mindmotion.dbmanager.dto.TablesDTO;
import com.mindmotion.dbmanager.entity.Tables;
import com.mindmotion.dbmanager.mapper.TablesMapper;
import com.mindmotion.dbmanager.service.ITablesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MMNJ002 on 2019/12/19.
 */
@Service
public class TablesService implements ITablesService {
    @Autowired
    private TablesMapper tablesMapper;

    @Override
    public TablesDTO create(TablesDTO tablesDTO) {
        return null;
    }

    @Override
    public TablesDTO update(TablesDTO tablesDTO) {
        return null;
    }

    @Override
    public TablesDTO delete(TablesDTO tablesDTO) {
        return null;
    }

    @Override
    public TablesDTO findByAccountAndTableName(String account, String tableName) {
        return null;
    }

    @Override
    public List<TablesDTO> findByAccount(String account) {
        List<Tables> tables = tablesMapper.findTablesByAccount(account);
        return null;
    }
}
