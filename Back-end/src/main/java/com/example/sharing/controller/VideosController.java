package com.example.sharing.controller;

import com.example.sharing.entity.Videos;
import com.example.sharing.servise.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/videos")
public class VideosController {
    @Autowired
    private IVideosService iVideosService;
    @RequestMapping(value = "/getMadeByUserNo",method = RequestMethod.POST)
    private Videos[] getMadeByUserNo(@RequestParam int userNo){
        return iVideosService.getMadeByUserNo(userNo);
    }


    @RequestMapping(value = "/search",method = RequestMethod.POST)
    private Videos[] search(@RequestParam String searchWords){
        return iVideosService.search(searchWords);
    }



    @RequestMapping(value = "/getPartVideos",method = RequestMethod.POST)
    private Videos[] getPartVideos(@RequestParam int userNo){
        return iVideosService.getPartVideos(userNo);
    }

    @RequestMapping(value = "/addVdo",method = RequestMethod.POST)
    private int addVdo(@RequestParam Videos vdo) {
        iVideosService.addVdo(vdo);
        return 1;
    }

    @RequestMapping(value = "/deleteVdo",method = RequestMethod.POST)
    private int deleteVdo(@RequestParam int vdoId) { iVideosService.deleteVdo(vdoId); return 1; }


    @RequestMapping(value = "/getByVdoID",method = RequestMethod.POST)
    private Videos getByVdoID(@RequestParam int vdoId){
         return iVideosService.getByVdoID(vdoId);
    }

}

