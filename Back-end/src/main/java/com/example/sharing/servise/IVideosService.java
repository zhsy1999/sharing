package com.example.sharing.servise;


import com.example.sharing.entity.Videos;


public interface IVideosService {
    Videos[] getMadeByUserNo(int userNo);
    Videos[] search(String searchWords);
    Videos[] getPartVideos(int userNo);
    void commentNumSub1(int vdoId);
    void commentNumAdd1(int vdoId);
    void likeNumAdd1(int vdoId);
    int addVdo(Videos video);
    void deleteVdo(int vdoId);
    Videos getByVdoID(Integer vdoId);
}
