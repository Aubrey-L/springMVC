package com.springmvc;

import com.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController {

    @RequestMapping(method =RequestMethod.GET,value = "/user")
    public ModelAndView user(){
        return   new ModelAndView("user", "command", new User());

    }
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("SpringWeb")User user,
                          ModelMap model) {
        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());

        return "userlist";
    }

}
