package com.kang.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String say(){
        return "{\n" +
                "\t\"id\": \"cashbook://home\",\n" +
                "\t\"title\": \"首页\",\n" +
                "\t\"modules\": [{\n" +
                "\t\t\"id\": \"home_cate\",\n" +
                "\t\t\"title\": \"分类\",\n" +
                "\t\t\"dlist\": [{\n" +
                "\t\t\t\"title\": \"推荐\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"title\": \"分类\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"title\": \"排行\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"title\": \"我的\"\n" +
                "\t\t}]\n" +
                "\t}]\n" +
                "}";
    }
}
