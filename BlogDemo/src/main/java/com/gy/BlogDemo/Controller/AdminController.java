package com.gy.BlogDemo.Controller;

import com.gy.BlogDemo.POJO.AdminPOJO;
import com.gy.BlogDemo.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 需求:
 *
 * @Author 顾杨
 * @date 2022年05月05日19:14
 * @Version 1.0
 */
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping("/index.do")
       public String getUsername(AdminPOJO adminPOJO, Model model){
         int i=adminService.getUsername(adminPOJO);
         if(i==0){
             model.addAttribute("msg","密码或者账号错误,请重新输入!");
             return "index.html";
         }
         return "main.html";
       }

       @PostMapping("/insert.do")
    public String insertUsername(AdminPOJO adminPOJO,Model model){
        int i=adminService.insertUsername(adminPOJO);
        if(i==0){
            model.addAttribute("emsg","注册失败");
            return "register.html";
        }
        return "index.html";
    }
}
