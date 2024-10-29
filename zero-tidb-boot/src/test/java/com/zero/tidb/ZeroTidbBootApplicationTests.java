package com.zero.tidb;

import com.zero.tidb.domain.entity.SystemUserEntity;
import com.zero.tidb.mapper.SystemUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZeroTidbBootApplicationTests {

    @Autowired
    private SystemUserMapper systemUserMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testMysql(){
        for (SystemUserEntity row : systemUserMapper.selectList(null)) {
            System.out.println(row.toString());
        }
    }
}
