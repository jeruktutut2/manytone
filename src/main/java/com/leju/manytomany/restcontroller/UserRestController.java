package com.leju.manytomany.restcontroller;

import com.leju.manytomany.model.User;
import com.leju.manytomany.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<User> all() {
        return userService.findAll();
    }
}
