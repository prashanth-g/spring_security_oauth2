package com.prashanth.security.oauth2.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user/me")
    public String user() {
        return "{\"name\":\"prashanth\"}";
    }
}
