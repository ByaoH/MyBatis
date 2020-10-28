package com.l.dao;


import com.l.pojo.User;
import com.l.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
//    测试缓存
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();

        User user2 = mapper2.queryUserById(1);
        System.out.println(user2 == user);

        sqlSession2.close();
    }
}
