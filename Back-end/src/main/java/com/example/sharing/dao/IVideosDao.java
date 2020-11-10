package com.example.sharing.dao;


import com.example.sharing.entity.Videos;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository

public interface IVideosDao {
    Videos[] getMadeByUserNo(@Param("userNo") int userNo);      /*通过用户号获取制作的视频 */
    Videos[] search(@Param("searchWords") String searchWords);
    Videos[] getPartVideos(@Param("userNo") int userNo);   /*通过用户号获取推荐视频资源*/
    Videos getByVdoID(@Param("vdoId")Integer vdoId);     /*通过视频ID获得全部信息*/
    void addVdo(Videos video);
    void deleteVdo(@Param("vdoId") int vdoId);
    void commentNumSub1(@Param("vdoId") int vdoId);   /*评论加一*/
    void commentNumAdd1(@Param("vdoId") int vdoId);   /*评论减一*/
    void likeNumAdd1(@Param("vdoId") int vdoId);      /*点赞加一*/

}
