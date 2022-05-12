package com.gy.BlogDemo.Service;

import com.gy.BlogDemo.Mapper.AdminMapper;
import com.gy.BlogDemo.POJO.AdminPOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 需求:
 *
 * @Author 顾杨
 * @date 2022年05月05日19:15
 * @Version 1.0
 */
@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;
    /**
    * 需求:登录
    * @author 顾杨
    * @date
    * Version V1.0
    */
    public int getUsername(AdminPOJO adminPOJO){
      return adminMapper.getUsername(adminPOJO);
    }

    /**
    * 需求:注册
    * @author 顾杨
    * @date
    * Version V1.0
    */
    public int insertUsername(AdminPOJO adminPOJO){
        return adminMapper.insertUsername(adminPOJO);
    }
}

