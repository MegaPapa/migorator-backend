package com.megapapa.migorator.controller;

import com.megapapa.migorator.dto.UserDTO;
import com.megapapa.migorator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/profile/{id}")
    @ResponseBody
    public void getUser(@PathVariable("id") int id) {
        UserDTO user = userService.getUser(id);
    }
}
