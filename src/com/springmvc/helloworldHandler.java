package com.springmvc;

import com.springmvc.model.sudent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloworldHandler {
    @RequestMapping("/sring")
    public  String string(ModelMap model){
        model.addAttribute("mes", "Hello Spring MVC Framework!");
        return "index";
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView student(){

        return new ModelAndView("studen", "command", new sudent());

    }
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")sudent student,
                             ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        return "index2";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index3";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/final.html";
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String index1() {
        return "index4";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect1() {

        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {
        return "resText";
    }




}