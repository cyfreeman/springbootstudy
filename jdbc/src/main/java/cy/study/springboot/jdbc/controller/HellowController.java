package cy.study.springboot.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HellowController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping(value = "/jdbc")
    public Map<String, Object> map() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * FROM department");
        return list.get(0);
    }
}
