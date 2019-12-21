package com.mindmotion.dbmanager.mapper;

import com.mindmotion.dbmanager.entity.Tables;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TablesMapper {
    Integer save(Tables tables);
    Tables tablesFindByAccountAndName(Tables tables);
    List<Tables> findTablesByAccount(String account);
}
