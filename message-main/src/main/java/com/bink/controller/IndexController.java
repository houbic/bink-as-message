package com.bink.controller;

import com.bink.base.ManagerService;
import com.bink.entity.User;
import com.bink.web.HtmlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by chenbinghao on 16/8/22.
 */
@Controller
@RequestMapping("message")
public class IndexController {

    @Autowired
    private HtmlService htmlService;

    @Autowired
    private ManagerService managerService;

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();
        logger.debug("session id :{}", session.getId());
        String username = (String)session.getAttribute("username");
        User user = managerService.getUserByName(username);
        logger.info("user[{}], log in", username);
        ModelAndView mv;
        if (user == null) {
            logger.warn("incorrect user go to index");
            mv = new ModelAndView("login");
        } else {
            logger.info("user[{}], go to index", username);
            String leftTree = htmlService.setLeftTree(user);
            mv = new ModelAndView("index", "leftTree", leftTree);
        }
        return mv;

    }

}
