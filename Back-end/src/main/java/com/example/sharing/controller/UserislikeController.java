package com.example.sharing.controller;

import com.example.sharing.entity.Userislike;
import com.example.sharing.servise.IUserislikeService;
import com.example.sharing.servise.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/like")
public class UserislikeController {
    @Autowired
    private IUserislikeService iUserIsLikeService;
    @Autowired
    private IVideosService iVideosService;

    @RequestMapping(value = "/addLike",method = RequestMethod.POST)
    private void addLike(@RequestBody Userislike userIsLike) {
        if(iUserIsLikeService.getIsLike(userIsLike)==1) return;
        iUserIsLikeService.addLike(userIsLike);
        if(userIsLike.getIsLike()==1) {
            iVideosService.likeNumAdd1(userIsLike.getVdoId());
        }
    }

    @RequestMapping(value = "/deleteLike",method = RequestMethod.POST)
    private void deleteLike(@RequestBody Userislike userIsLike) {
        if(iUserIsLikeService.getIsLike(userIsLike)==0) return;
        iUserIsLikeService.deleteLike(userIsLike);

    }

    @RequestMapping(value = "/getIsLike",method = RequestMethod.POST)
    private Integer getIsLike(@RequestBody Userislike userIsLike) {
        return iUserIsLikeService.getIsLike(userIsLike);
    }
}

