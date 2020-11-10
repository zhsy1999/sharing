package com.example.sharing.controller;

import com.example.sharing.entity.Comments;
import com.example.sharing.servise.ICommentsService;
import com.example.sharing.servise.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/comment")
public class CommentsController {
    @Autowired
    private ICommentsService iCommentsService;
    @Autowired
    private IVideosService iVideosService;
    /* 日期：20201108
     * 创建人：张思远 */

    @RequestMapping(value = "/viewComment",method = RequestMethod.POST)
    private Comments[] viewComment(@RequestParam int vdoId){
        return iCommentsService.viewComment(vdoId);
    }

    @RequestMapping(value = "/deleteCom",method = RequestMethod.POST)
    private void deleteCom(@RequestParam int cmtId){
        int vdoId = iCommentsService.getCom(cmtId).getVdoId();
        iCommentsService.deleteCom(cmtId);
        iVideosService.commentNumSub1(vdoId);
    }

    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    private Comments addComment(@RequestBody Comments cmt){
        cmt = iCommentsService.getCom(iCommentsService.addComment(cmt));
        iVideosService.commentNumAdd1(cmt.getVdoId());
        return cmt;
    }

}
