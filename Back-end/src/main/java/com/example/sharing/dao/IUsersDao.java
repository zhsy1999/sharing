package com.example.sharing.dao;

import com.example.sharing.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersDao {
    Users users(@Param("username") String username ,@Param("password") String password);   /*测试*/
    void signup(Users user);                                                               /*注册*/
    Users signin(@Param("username") String username,@Param("password") String password);   /*登录*/
    void changePwd(@Param("username") String username,@Param("password") String password);  /*修改密码*/
    Users signinStatus(@Param("phone")String phone);                                        /*注册状态*/
    Users getByuserNo(@Param("userNo") Integer userNo);                                     /*测试*/
    void edit(Users users);
    String GetAttentionsNumber(Integer userNo);
    String GetFansNumber(Integer userNo);
}
