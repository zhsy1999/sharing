package com.example.sharing.dao;

import com.example.sharing.entity.Userislike;
import org.springframework.stereotype.Repository;
@Repository
public interface IUserislikeDao {
    void addLike(Userislike usrIsLike);
    Userislike getIsLike(Userislike usrIsLike);
    void deleteLike(Userislike usrIsLike);
}
