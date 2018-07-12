package com.xzp.springbootmybatis.mapper;

import com.xzp.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * User映射
 * 参考连接:http://blog.didispace.com/mybatisinfo/
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-12-10:32
 */
@Mapper
public interface UserMapper {

    //查询
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByNmae(@Param("name") String name);

    //    插入
    @Insert("INSERT INTO USER(NAME,AGE) VALUES (#{name},#{age})")
    int insert(@Param("name") String name,@Param("age") Integer age);

    @Results({
            @Result(property = "name",column = "name"),
            @Result(property = "age",column = "age")
    })
    @Select("SELECT name,age FROM user")
    List<User> findAll();

    @Update("UPDATE user SET age = #{age} WHERE name = #{name}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);

    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    int insertByUser(User user);

    @Insert("INSERT INTO user(name, age) VALUES(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);


}
