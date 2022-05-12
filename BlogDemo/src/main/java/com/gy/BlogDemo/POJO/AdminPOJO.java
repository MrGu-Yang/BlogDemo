package com.gy.BlogDemo.POJO;

import lombok.Data;
import lombok.ToString;

/**
 * 需求:
 *
 * @Author 顾杨
 * @date 2022年05月05日16:29
 * @Version 1.0
 */
@Data
public class AdminPOJO {
   private int  id;
   private String username;
   private String userpassword;
   private String newuserpassword;

}
