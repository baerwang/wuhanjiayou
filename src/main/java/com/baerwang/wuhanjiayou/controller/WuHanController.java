package com.baerwang.wuhanjiayou.controller;

import com.baerwang.wuhanjiayou.service.WuHanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author baerwang
 * @date 2020/2/9 20:53
 */
@Controller
public class WuHanController {

    @Autowired
    private WuHanService wuHanService;

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }


    @ResponseBody
    @PostMapping("/api")
    public Object api(String provinceName) {
        try {
            return wuHanService.provinceInfo(provinceName);
        } catch (Exception e) {
            e.printStackTrace();
            return "抱歉，没有找到省份，请重新输入！";
        }
    }

}
