package com.gy.BlogDemo.Mapper;

import com.gy.BlogDemo.POJO.AdminPOJO;

/**
 * 需求:
 *
 * @Author 顾杨
 * @date 2022年05月05日19:14
 * @Version 1.0
 */
public interface  AdminMapper {
    /**
    * 需求:登录
    * @author 顾杨
    * @date
    * Version V1.0
    */
    public int getUsername(AdminPOJO adminPOJO);
    /**
    * 需求:注册
    * @author 顾杨
    * @date
    * Version V1.0
    */
    public int insertUsername(AdminPOJO adminPOJO);
}
