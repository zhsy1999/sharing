package com.example.sharing.servise.impl;

import com.example.sharing.dao.ICommentsDao;
import com.example.sharing.entity.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sharing.servise.ICommentsService;
@Service
public class CommentsService implements ICommentsService{
    @Autowired
    private ICommentsDao iCommentsDao;

    @Override
    public Comments[] viewComment(int vdoId) {
        return iCommentsDao.viewComment(vdoId);
    }

    @Override
    public Comments getCom(int cmtId) {
        return iCommentsDao.getCom(cmtId);
    }

    @Override
    public void deleteCom(int cmtId) {
        iCommentsDao.deleteCom(cmtId);
    }

    @Override
    public int addComment(Comments cmt) {
        iCommentsDao.addComment(cmt);
        return cmt.getCmtId();
    }
}
