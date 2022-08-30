package com.cjl.chapter6;


import com.cjl.chapter6.mapper.CityMapper;
import com.cjl.chapter6.mapper.UserMapper;
import com.cjl.chapter6.model.City;
import com.cjl.chapter6.model.Scenic;
import com.cjl.chapter6.model.User;
import org.apache.tomcat.websocket.WsContainerProvider;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;


@SpringBootTest
class Chapter6ApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    void contextLoads() {
    }

    @Test
    public void testSelectAllUser() {
        List<User> users = userMapper.selectAllUser();
        for (User user : users) {
            System.out.println("name:" + user.getName() + ", age:" +user.getAge() + ", city_id:" + user.getCity_id());
        }
    }

    @Test
    public void testSelectOneUser() {
         User user = userMapper.selectOne(1L);
         System.out.println("name:" + user.getName() + ", age:" +user.getAge() + ", city_id:" + user.getCity_id());
    }

    @Test
    public void testInsertOneUser() {
        testSelectAllUser();
        userMapper.insertOneUser(new User("张晓敏",28,2));
        testSelectAllUser();
    }

    @Test
    public void testUpdateByPrimaryKey() {
        User user = userMapper.selectOne(6L);
        user.setName("张晓敏更新");
        user.setAge(29);
        userMapper.updateByPrimaryKey(user);
    }

    @Test
    public  void testDeleteByPrimaryKey() {
        userMapper.deleteByPrimaryKey(6L);
    }

    @Test
    public  void testSelectUserByIdLike() {
        HashMap<String, Integer> paraMap = new HashMap<>();
        paraMap.put("age", 28);
        paraMap.put("city_id", 3);
        User user = userMapper.selectUserByIdLike(paraMap);
        System.out.println("name: " + user.getName() + " age: " + user.getAge()+" city_id: " + user.getCity_id());
    }

    @Test
    public void testSelectUserByIdChoose1() {
        HashMap<String, Integer> paraMap = new HashMap<>();
        paraMap.put("age", 20);
        User user = userMapper.selectUserByIdChoose(paraMap);
        System.out.println("name: " + user.getName() + " age: " + user.getAge()+" city_id: " + user.getCity_id());
    }

    @Test
    public void testSelectUserByIdChoose2() {
        HashMap<String, Integer> paraMap = new HashMap<>();
        paraMap.put("age", 28);
        paraMap.put("city_id", 3);
        User user = userMapper.selectUserByIdChoose(paraMap);
        System.out.println("name: " + user.getName() + " age: " + user.getAge()+" city_id: " + user.getCity_id());
    }

    @Test
    public void testSelectUseSqlTag() {
        User user = userMapper.selectUseSqlTag(2L);
        System.out.println("name: " + user.getName() + " age: " + user.getAge()+" city_id: " + user.getCity_id());

    }

    @Test
    public void testSelectUserByWhere()
    {
        HashMap<String, Integer> paraMap = new HashMap<>();
        //参数是空的
        List<User> users = userMapper.selectUserByWhere(paraMap);
        for (User user : users) {
            System.out.println("name:" + user.getName() + ", age:" +user.getAge() + ", city_id:" + user.getCity_id());
        }
    }


    @Test
    public void testSelectUserAndCity() {
        User user = userMapper.selectUserAndCity(1L);
        System.out.println("name:" + user.getName()+" age: "+user.getAge()+
                " city name: " + user.getCity().getCityName() + " country: " + user.getCity().getCountry());
    }

    @Autowired
    private CityMapper cityMapper;

    @Test
    public void testSelectCityAndScenics() {
        City city = cityMapper.selectCityAndScenics(1L);
        System.out.println("所选城市信息： " + "城市名: "+ city.getCityName());
        System.out.println("所选城市景点信息： ");
        for(Scenic scenic : city.getScenics()) {
            System.out.println("景点名： " + scenic.getScenicName() +
              " 景点价格: " + scenic.getPrice() +
                    " 景点编号: " + scenic.getScenicId());
        }
    }

}
