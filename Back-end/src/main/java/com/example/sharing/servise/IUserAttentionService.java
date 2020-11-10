package com.example.sharing.servise;

import com.example.sharing.entity.UserAttention;
import java.util.List;

public interface IUserAttentionService {
    void addAttention(UserAttention userAttention);
    void cancelAttention(Integer fanNo,Integer starNo);
    List<UserAttention> getUserAttentions(Integer fanNo);
    List<UserAttention> getUserFans(Integer starNo);
}
