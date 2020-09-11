package cy.study.springboot003webrestful.controller;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellowController {

    @ResponseBody
    @RequestMapping(value = "/hellow")
    public String hellow() {
        return "welcomepage";
    }
}
