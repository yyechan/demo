package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api")
public class controller {

    @PostMapping(path = "/addCustomMenuAjax")
    @ResponseBody
    String addCustomMenuAjax(MyForm myForm){
        System.out.println(myForm.cmpCd);
        return "OK";
    }

}
