package com.example.sharing.servise.impl;

import com.example.sharing.dao.IUserAttentionDao;
import com.example.sharing.entity.UserAttention;
import com.example.sharing.servise.IUserAttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserAttentionService implements IUserAttentionService {
    @Autowired
    private IUserAttentionDao iUserAttentionDao;

    @Override
    public void addAttention(UserAttention userAttention) { iUserAttentionDao.addAttention(userAttention);}

    @Override
    public void cancelAttention(Integer fanNo,Integer starNo) {iUserAttentionDao.cancelAttention(fanNo,starNo);}

    @Override
    public List<UserAttention> getUserAttentions(Integer fanNo) {
        return iUserAttentionDao.getUserAttentions(fanNo);
    }

    @Override
    public List<UserAttention> getUserFans(Integer starNo) {
        return iUserAttentionDao.getUserFans(starNo);
    }

}
