package com.iterror.manager.admin.controller;

import com.google.common.collect.Maps;
import com.iterror.manager.admin.util.view.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class IndexController extends BaseController {



    @RequestMapping("/")
    public String index(Model model) {
        Map user = Maps.newHashMap();
        user.put("id", 1);
        user.put("name", "曹操");
        user.put("description", "一代枭雄");
        model.addAttribute("user", user);
        return "index";
    }

}
