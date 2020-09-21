package cy.study.springboot003webrestful.controller;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HellowController {

//    @RequestMapping(value = {"/", "/index.html"})
//    public String index() {
//        return "index";
//    }

    @ResponseBody
    @RequestMapping(value = "/hellow")
    public String hellow() {
        return "welcomepage";
    }

    @RequestMapping(value = "/success")
    public String success(Map<String, Object> obj) {
        obj.put("hellowooo", "<h1>雷猴啊</h1>");
        obj.put("users", Arrays.asList("zs", "ls", "wemz"));
        return "success";
    }
    @RequestMapping(value = "/rx")
    public String rx(Map<String, Object> obj) {
        return "rx";
    }
}
