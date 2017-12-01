package com.megapapa.migorator.controller;

import com.megapapa.migorator.dto.UserDTO;
import com.megapapa.migorator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/profile/{id}")
    @ResponseBody
    public UserDTO getUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

    @RequestMapping("/profile-get-token/{email}")
    @ResponseBody
    public UserDTO getUser(@PathVariable("email") String email) {
        return userService.getUser(email);
    }

    @PostMapping("/signup")
    public UserDTO signUp(@RequestBody UserDTO userDTO) {
        final int userNamePiece = 0;
        String email = userDTO.getEmail();
        String[] emailPieces = email.split("\\@");
        userDTO.setUserName(emailPieces[userNamePiece]);
        userService.registerNewUser(userDTO);
        return null;
    }
}
