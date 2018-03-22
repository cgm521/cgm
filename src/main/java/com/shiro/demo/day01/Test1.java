package com.shiro.demo.day01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test1 {
    private static Logger logger = LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        String sql = "select * form acl_tenant";
        List<Object> query = jdbcTemplate.query(sql, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                return null;
            }
        });
        int update = jdbcTemplate.update(sql);
        


    }
}
