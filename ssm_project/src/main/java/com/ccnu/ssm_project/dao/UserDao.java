package com.ccnu.ssm_project.dao;
import com.ccnu.ssm_project.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserDao {
    /**
     * 通过id查询
     */
    @Select("select * from user where id=#{id}")
    User findUserById(@Param("id") int id);

//    @Insert("insert into user(name,age,money) values(#{u.name},#{u.age},#{u.money})")
//    public void addUser(@Param("u") User user);

    //动态插入user
    @Insert("insert into user(name,age,money) values(#{name},#{age},#{money})")
    public void insertUser(@Param("name") String name,@Param("age") int age,@Param("money") double money);

    //根据id修改user
    @Update("update user set name=#{name},age=#{age},money=#{money} where id=#{id}")
    public void updateUser(@Param("name") String name,@Param("age") int age,@Param("money") double money,@Param("id") int id);

    //根据id删除user
    @Delete("delete from user where id=#{id}")
    public void deleteUser(@Param("id") int id);

    //转账接口,A转账方
    @Update("update user set money=money-#{count} where id=#{id1}")
    public void updateUserMoney(@Param("count") double count,@Param("id1") int id1);

    //转账接口,B接受方
    @Update("update user set money=money+#{count} where id=#{id2}")
    public void updateUserMoney1(@Param("count") double count,@Param("id2") int id2);


}
