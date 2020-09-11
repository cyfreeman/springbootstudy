package cy.study.springboot002.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class HellowController {

    @RequestMapping(value = "/hellow")
    public String hellow() {
        return "hellow world CY !";
    }
}
