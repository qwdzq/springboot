package com.cjl.chapter6.mapper;


import com.cjl.chapter6.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.List;


@Component
public interface UserMapper {
    List<User> selectAllUser();
    User selectOne(Long id);
    int insertOneUser(User user);
    int updateByPrimaryKey(User user);
    int deleteByPrimaryKey(Long id);
    User selectUserByIdLike(HashMap<String , Integer> map);
    User selectUserByIdChoose(HashMap<String, Integer> map);
    User selectUseSqlTag(Long id);
    List<User>  selectUserByWhere(HashMap<String , Integer> map);
    User selectUserAndCity(Long id);
}
