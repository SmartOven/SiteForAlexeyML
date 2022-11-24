package com.github.smartoven.site.controller;

import com.github.smartoven.site.bot.config.ConfigService;
import com.github.smartoven.site.bot.config.ConfigViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bot")
public class BotConfigApiController {
    private final ConfigService configService;

    public BotConfigApiController(ConfigService configService) {
        this.configService = configService;
    }

    @PutMapping("/config")
    public ResponseEntity<?> updateConfig(@RequestBody ConfigViewModel configViewModel) {
        configService.updateConfig(configViewModel);
        return ResponseEntity.ok().build();
    }
}
