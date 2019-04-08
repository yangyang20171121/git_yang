package com.ccnu.ssm_project.service;

import com.ccnu.ssm_project.bean.User;
import com.ccnu.ssm_project.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 根据id查询信息
     */
    public User selectUserById(int id){
        return userDao.findUserById(id);
    }

//    public void addUser(User user){
//         userDao.addUser(user);
//    }

    public void insertUser(String name,int age,double money){
        userDao.insertUser(name,age,money);
    }

    //修改用户
    public void updateUser(String name,int age,double money,int id){
        userDao.updateUser(name,age,money,id);
    }

    //删除用户
    public void deleteUser(int id){
        userDao.deleteUser(id);
    }

    //转账
    @Transactional
    public void transferMoney(double count ,int id1,int id2){
        userDao.updateUserMoney(count,id1);

        userDao.updateUserMoney1(count,id2);
    }




}
