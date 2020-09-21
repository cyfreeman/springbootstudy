package com.cy.springbootjpa.controller;

import com.cy.springbootjpa.entity.Usr;
import com.cy.springbootjpa.repository.UsrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public class UsrController {
    @Autowired
    UsrRepository usrRepository;

    @GetMapping("/usr/{id}")
    public Usr getUsr(@PathVariable("id") Integer id) {
        Usr usr = usrRepository.findOne(id);
    }
}
