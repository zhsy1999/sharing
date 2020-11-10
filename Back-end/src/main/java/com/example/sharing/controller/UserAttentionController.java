package com.example.sharing.controller;

import com.example.sharing.entity.UserAttention;
import com.example.sharing.entity.Users;
import com.example.sharing.servise.IUserAttentionService;
import com.example.sharing.servise.IUsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/userattention")
public class UserAttentionController {
    @Autowired
    private IUserAttentionService iUserAttentionService;
    @Autowired
    private IUsersService iUsersService;

    @RequestMapping(value = "/addAttention",method = RequestMethod.POST)
    private void addAttention(@RequestParam Integer fanNo,@RequestParam Integer starNo){
        UserAttention userAttention = new UserAttention();
        userAttention.setFanNo(fanNo);
        userAttention.setStarNo(starNo);
        iUserAttentionService.addAttention(userAttention);
        Users star = iUsersService.getByuserNo(starNo);
        star.setFansNum(star.getFansNum()+1);
        iUsersService.edit(star);
        Users fan = iUsersService.getByuserNo(fanNo);
        fan.setAttentionNum(fan.getAttentionNum()+1);
        iUsersService.edit(fan);
    }
    @RequestMapping(value = "/cancelAttention",method = RequestMethod.POST)
    private void cancelAttention(@RequestParam Integer fanNo,
                                 @RequestParam Integer starNo){
        Users star = iUsersService.getByuserNo(starNo);
        star.setFansNum(star.getFansNum()-1);
        iUsersService.edit(star);
        Users fan = iUsersService.getByuserNo(fanNo);
        fan.setAttentionNum(fan.getAttentionNum()-1);
        iUsersService.edit(fan);
        iUserAttentionService.cancelAttention(fanNo,starNo);
    }
    @RequestMapping(value = "/getUserAttentions",method = RequestMethod.POST)
    private List<UserAttention> getUserAttentions(@RequestParam Integer userNo){
        return iUserAttentionService.getUserAttentions(userNo);
    }
    @RequestMapping(value = "/getUserFans",method = RequestMethod.POST)
    private List<UserAttention> getUserFans(@RequestParam Integer userNo){
        return iUserAttentionService.getUserFans(userNo);
    }
}