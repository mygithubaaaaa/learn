package test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:test.Test
 * Author:  Liu pan 刘攀
 * Date:    2022/7/31 19:19
 */

@Slf4j
public class Junit5Test {
    /**
     * 坑，org.junit.Test和org.junit.jupiter.api.Test不同，使用前者时，配合@BeforeAll和@BeforeEach会不起作用
     */

    /**
     * 在测试类执行之前执行的方法 必须用static 相当与testng中的@BeforeClass
     */
    @BeforeAll
    public static void beforeAll() {
        log.info("beforeAll");
    }

    @BeforeEach
    void beforeEach(){
        log.info("beforeEach");
    }

    @Test
    public void test(){
        log.info("test");
    }

    /**
     * 运行整个测试类时忽略
     */
    @Test
    @Disabled
    public void disable(){
        log.info("disable");
    }

    @RepeatedTest(3)
    public void repeatedTest(){
        log.info("repeatedTest");
    }

    @AfterEach
    public void afterEach(){
        log.info("afterEach");
    }

    @AfterAll
    public static void afterAll(){
        log.info("afterAll");
    }

    @Tag("testTag")
    @Test
    public void testTag(){
        log.info("testTag");
    }

    @Test
    @DisplayName("测试方法名")
    public void testDisplayName(){
        log.info("testDisplayName");
    }




}
