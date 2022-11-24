package com.github.smartoven.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BotConfigWebController {
    @GetMapping("/config")
    public String updatingConfigPage() {
        return "index";
    }
}
