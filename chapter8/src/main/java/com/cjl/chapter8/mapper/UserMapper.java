package com.cjl.chapter8.mapper;


import com.cjl.chapter8.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.type.JdbcType.BIGINT;
import static org.apache.ibatis.type.JdbcType.VARCHAR;

@Component
public interface UserMapper {
    @Select("select * from user")
    List<User> selectAllUser();

    @Select("select * from user where id=#{id}")
    User selectUserById(Long id);

    @Select("select * from user where name=#{name} and age=#{age}")
    User selectUserByParam(@Param("name") String realName, @Param ("age") Integer realAge);

    @Select("select * from user where name=#{name} and age = #{age}")
    User selectUserByMap(Map<String, Object> map);

    @Insert({
            "insert into user (name, age, city_id) values ( " +
                    "#{name, jdbcType=VARCHAR}, " +
                    "#{age, jdbcType=INTEGER}, " +
                    "#{city_id, jdbcType=INTEGER} )"
    })
    void inset(User user);

    @Select( {
            "select id, name as full_name, age as full_age from user " +
                    "where id = #{id, jdbcType=BIGINT}"
    })
    @Results( {
             @Result(column="id", property = "id", jdbcType = JdbcType.BIGINT),
            @Result(column="full_name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column="full_age", property = "age", jdbcType = JdbcType.BIT)

    })
    User selectByIdResult(Long id);


}
