package com.example.sharing.dao;

import com.example.sharing.entity.UserAttention;
import com.example.sharing.servise.IUserAttentionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IUserAttentionDao {
    void addAttention(UserAttention userAttention);
    void cancelAttention(Integer fanNo,Integer starNo);
    List<UserAttention> getUserAttentions(@Param("fanNo")Integer fanNo);
    List<UserAttention> getUserFans(@Param("starNo")Integer starNo);
}
