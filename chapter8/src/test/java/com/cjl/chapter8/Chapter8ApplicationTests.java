package com.cjl.chapter8;

import com.cjl.chapter8.mapper.UserMapper;
import com.cjl.chapter8.model.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Chapter8ApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelectAllUser() {
        List<User> users =  userMapper.selectAllUser();
        for(User user : users) {
            System.out.println(" user name: " + user.getName()
                    + " age: " + user.getAge());
        }
    }

    @Test
    public void testSelectUserById() {
        User  user = userMapper.selectUserById(1L);
        System.out.println(" user name: " + user.getName()
                + " age: " + user.getAge());

    }

    @Test
    public void testSelectUserByParam() {
        User user = userMapper.selectUserByParam("张华",28);
        System.out.println(" user name: " + user.getName()
                + " age: " + user.getAge());
    }

    @Test
    public void testSelectUserByMap() {
        Map<String, Object> param = new HashMap<>();
        param.put("name", "陈雨");
        param.put("age", 22);
        User user = userMapper.selectUserByMap(param);
        System.out.println(" user name: " + user.getName()
                + " age: " + user.getAge());
    }

    @Test
    public void testInsertUser() {
        User usr = new User("测试", 20, 1);
        userMapper.inset(usr);
        testSelectAllUser();
    }


    @Test
    public void testSelectByIdResuts(){
        User  user = userMapper.selectByIdResult(3L);
        System.out.println(" user name: " + user.getName()
                + " age: " + user.getAge());
    }

    @Test
    public void testSelectListPaged() {
        PageHelper.startPage(1, 2);
        List<User> users = userMapper.selectAllUser();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        System.out.println("总页数："+pageInfo.getPages()+", 总条数：" +pageInfo.getTotal()+",当前页号:"+pageInfo.getPageNum() );
        for (User user : users) {
            System.out.println("name:" + user.getName()+", age: " + user.getAge());
        }
    }
}
