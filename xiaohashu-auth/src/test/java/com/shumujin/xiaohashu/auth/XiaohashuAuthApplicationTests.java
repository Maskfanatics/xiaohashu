package com.shumujin.xiaohashu.auth;

import com.shumujin.framework.common.util.JsonUtil;
import com.shumujin.xiaohashu.auth.domain.dataobject.UserDO;
import com.shumujin.xiaohashu.auth.domain.mapper.UserDOMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
class XiaohashuAuthApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private UserDOMapper userDOMapper;

    /**
     * 测试插入数据
     */
    @Test
    void testInsert() {
        UserDO userDO = UserDO.builder()
                .username("shumujin")
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();
        userDOMapper.insert(userDO);
    }

    @Test
    void testSelect() {
        UserDO userDO = userDOMapper.selectByPrimaryKey(1L);
        log.info("User: {}", JsonUtil.toJsonString(userDO));
    }

    @Test
    void testUpdate() {
        UserDO userDO = UserDO.builder()
                .id(1L)
                .username("shumujin2")
                .updateTime(LocalDateTime.now())
                .build();
        userDOMapper.updateByPrimaryKey(userDO);
    }

    @Test
    void testDelete() {
        userDOMapper.deleteByPrimaryKey(1L);
    }
}
