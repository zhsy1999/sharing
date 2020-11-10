package com.example.sharing.servise.impl;

import com.example.sharing.dao.IVideosDao;
import com.example.sharing.entity.Videos;
import com.example.sharing.servise.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class VideosService implements IVideosService {
    @Autowired
    private IVideosDao iVideosDao;


    @Override
    public Videos[] getMadeByUserNo(int userNo) {
        return iVideosDao.getMadeByUserNo(userNo);
    }

    @Override
    public Videos[] search(String searchWords) {
        return iVideosDao.search(searchWords);
    }

    @Override
    public Videos[] getPartVideos(int userNo) {
        return getPartVideos(userNo);
    }

    @Override
    public int addVdo(Videos video) {
        video.setLikeNum(0);
        video.setWatchNum(0);
        iVideosDao.addVdo(video);
        int vdoId = video.getVdoId();
        return vdoId;
    }

    @Override
    public void deleteVdo(int vdoId) {
        iVideosDao.deleteVdo(vdoId);

    }
    @Override
    public void commentNumSub1(int vdoId) { iVideosDao.commentNumSub1(vdoId); }

    @Override
    public void commentNumAdd1(int vdoId) { iVideosDao.commentNumAdd1(vdoId); }

    @Override
    public void likeNumAdd1(int vdoId) { iVideosDao.likeNumAdd1(vdoId); }
    @Override
    public Videos getByVdoID(Integer vdoId) {
        return iVideosDao.getByVdoID(vdoId);
    }
}
