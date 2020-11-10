package com.example.sharing.servise.impl;

import com.example.sharing.dao.IUsersDao;
import com.example.sharing.dao.IVideosDao;
import com.example.sharing.entity.Resp;
import com.example.sharing.entity.Users;
import com.example.sharing.servise.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class UsersService implements IUsersService {
    @Autowired
    private IUsersDao iUsersDao;
    private IVideosDao iVideosDao;
    @Override
    public Users users(String username, String password) {
        return iUsersDao.users(username,password);
    }

    @Override
    public void signup(Users user){iUsersDao.signup(user);}
    @Override
    public Users signin(String username, String password) {
        return iUsersDao.signin(username,password);
    }
    @Override
    public void changePwd(String username, String password){iUsersDao.changePwd(username,password);}
    @Override
    public Users signinStatus(String phone){ return iUsersDao.signinStatus(phone);}
    @Override
    public Users getByuserNo(Integer userNo) { return iUsersDao.getByuserNo(userNo); }
    @Override
    public void edit(Users users) { iUsersDao.edit(users); }
    @Override
    public String GetAttentionsNumber(Integer userNo) {
        return iUsersDao.GetAttentionsNumber(userNo);
    }
    @Override
    public String GetFansNumber(Integer userNo) {
        return iUsersDao.GetFansNumber(userNo);
    }


    @Override
    public Resp<String> upload(MultipartFile file) {
        if (file.isEmpty()){
            return Resp.fall("400","文件为空!");
        }

        String OriginalFilename = file.getOriginalFilename();
        String fileName = System.currentTimeMillis()+"."+OriginalFilename.substring(OriginalFilename.lastIndexOf(".")+1);
        String filePath = "E:\\sharing\\mp4\\";
        File dest = new File(filePath+fileName);
        if (dest.getParentFile().exists())
            dest.getParentFile().mkdir();
        try{
            file.transferTo(dest);
        }catch (Exception e){
            e.printStackTrace();
            Resp.fall("500","上传失败！");
        }

        return Resp.success(fileName);
        //return dest;

    }


}
