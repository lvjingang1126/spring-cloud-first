package com.lv.jingang.service;

import com.lv.jingang.entity.User;
import org.springframework.stereotype.Service;

/**
 * 项目名称：springcloud
 *
 * @version 1.0
 * @Package: om.lv.jingang.service
 * @类名称：${type_name}
 * @类描述：
 * @创建人：吕金刚 lvjgjava@163.com
 * @创建时间：${date} ${time}
 * @修改人：吕金刚 lvjgjava@163.com
 * @修改时间： 2017/12/21 14:24
 * @修改备注：
 **/
@Service
public class ProviderService {
    public User test(){
        User u=new User();
        u.setUserName("吕金刚");
        u.setAge("18");
        u.setId("666");
        return u;
    }
}
