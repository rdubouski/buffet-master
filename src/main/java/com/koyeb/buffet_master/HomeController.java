package com.koyeb.buffet_master;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Optional;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}