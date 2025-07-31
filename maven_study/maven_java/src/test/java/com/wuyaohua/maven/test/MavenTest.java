package com.wuyaohua.maven.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MavenTest {

    @Test
    public void testAssert(){
        int a =10 ;
        int b =20;
//        使用junit 提供的断言功能 判断是否相等,断言成功无输出，断言失败报错
        Assertions.assertEquals(a+b,30);

    }
}
