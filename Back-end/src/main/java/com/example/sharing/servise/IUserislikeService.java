package com.example.sharing.servise;

import com.example.sharing.entity.Userislike;

public interface IUserislikeService {
    void addLike(Userislike userIsLike);
    void deleteLike(Userislike userIsLike);
    Integer getIsLike(Userislike userIsLike);
}
