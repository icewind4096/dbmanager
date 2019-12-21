package com.mindmotion.dbmanager.service.impl;

import com.mindmotion.dbmanager.dto.TablesDTO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TablesServiceTest {
    @Autowired
    TablesService tablesService;

    @Test
    void create() {
        System.out.println(tablesService.create(new TablesDTO(0, "IBM", "IBM_ACCOUNT_1", 0, "IBM_OPERATOR_1")));
        System.out.println(tablesService.create(new TablesDTO(0, "IBM", "IBM_ACCOUNT_2", 0, "IBM_OPERATOR_2")));
        System.out.println(tablesService.create(new TablesDTO(0, "IBM", "IBM_ACCOUNT_3", 0, "IBM_OPERATOR_3")));
        System.out.println(tablesService.create(new TablesDTO(0, "IBM", "IBM_ACCOUNT_4", 0, "IBM_OPERATOR_4")));
        System.out.println(tablesService.create(new TablesDTO(0, "IBM", "IBM_ACCOUNT_4", 0, "IBM_OPERATOR_4")));
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void findByAccountAndTableName() {
    }

    @Test
    void findByAccount() {
        tablesService.findByAccount("manley");
        tablesService.findByAccount("mindmotion");
    }
}