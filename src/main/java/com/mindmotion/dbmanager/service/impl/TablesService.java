package com.mindmotion.dbmanager.service.impl;

import com.mindmotion.dbmanager.dto.TablesDTO;
import com.mindmotion.dbmanager.entity.Tables;
import com.mindmotion.dbmanager.enums.ResultEnum;
import com.mindmotion.dbmanager.exception.DBManagerException;
import com.mindmotion.dbmanager.mapper.TablesMapper;
import com.mindmotion.dbmanager.service.ITablesService;

import org.springframework.beans.BeanUtils;
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
    public Integer create(TablesDTO tablesDTO) {
        if (findByAccountAndTableName(tablesDTO.getAccount(), tablesDTO.getName()) == null){
            Tables tables = new Tables();
            BeanUtils.copyProperties(tablesDTO, tables);
            tablesMapper.save(tables);
            return tables.getId();
        } else {
            throw new DBManagerException(ResultEnum.ACCOUNT_TABLES_EXIST);
        }
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
    public TablesDTO findByAccountAndTableName(String account, String name) {
        Tables tables = new Tables(account, name, 0, "");
        tables = tablesMapper.tablesFindByAccountAndName(tables);
        if (tables != null) {
            return new TablesDTO(tables.getId(), tables.getAccount(), tables.getName(), tables.getStatus(), tables.getOperator());
        } else {
            return null;
        }
    }

    @Override
    public List<TablesDTO> findByAccount(String account) {
        List<Tables> tables = tablesMapper.findTablesByAccount(account);
        return null;
    }
}
