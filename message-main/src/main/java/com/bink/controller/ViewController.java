package com.bink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenbinghao on 16/9/14.上午10:00
 */
@Controller
@RequestMapping("message")
public class ViewController {

    @RequestMapping("user/user_select")
    public String user_select() {
        return "user/user_select";
    }

}
