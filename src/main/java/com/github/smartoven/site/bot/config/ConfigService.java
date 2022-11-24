package com.github.smartoven.site.bot.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {
    private final ConfigRepository configRepository;
    private final ConfigMapper configMapper;

    public ConfigService(
            @Autowired ConfigRepository configRepository,
            @Autowired ConfigMapper configMapper
    ) {
        this.configRepository = configRepository;
        this.configMapper = configMapper;
    }

    public void updateConfig(ConfigViewModel configViewModel) {
        Optional<Config> configOptional = configRepository.findByChatId(configViewModel.getChatId());
        if (configOptional.isEmpty()) {
            Config createdConfig = configMapper.map(configViewModel);
            configRepository.save(createdConfig);
            return;
        }

        Config existingConfig = configOptional.get();
        configMapper.mapFields(configViewModel, existingConfig);
        configRepository.save(existingConfig);
    }
}
