package com.example.sharing.servise;

import com.example.sharing.entity.Comments;

public interface ICommentsService {
    Comments[] viewComment(int vdoId);
    Comments getCom(int cmtId);
    void deleteCom(int cmtId);
    int addComment(Comments cmt);
}
