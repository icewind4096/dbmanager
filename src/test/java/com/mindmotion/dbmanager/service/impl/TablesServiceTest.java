package com.mindmotion.dbmanager.service.impl;

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