package com.example.sharing.servise.impl;

import com.example.sharing.dao.IUserislikeDao;
import com.example.sharing.entity.Userislike;
import com.example.sharing.servise.IUserislikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserislikeService implements IUserislikeService {
    @Autowired
    private IUserislikeDao iUserIsLikeDao;

    @Override
    public void addLike(Userislike userIsLike) { iUserIsLikeDao.addLike(userIsLike); }

    @Override
    public void deleteLike(Userislike userIsLike) { iUserIsLikeDao.deleteLike(userIsLike); }

    @Override
    public Integer getIsLike(Userislike userIsLike) { return iUserIsLikeDao.getIsLike(userIsLike)==null?0:1; }
}
