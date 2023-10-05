package com.sehbeomschool.nova.global.api;

import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private final Environment env;

    @GetMapping(value="/profile")
    public String getProfile(){
        return Arrays.stream(env.getActiveProfiles())
            .findFirst()
            .orElse("");
    }

}
