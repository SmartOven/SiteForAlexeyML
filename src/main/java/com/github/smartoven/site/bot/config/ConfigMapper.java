package com.github.smartoven.site.bot.config;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ConfigMapper {
    public Config map(ConfigViewModel configViewModel) {
        return new Config(
                null,
                configViewModel.getChatId(),
                booleanListToString(configViewModel.getOnThreat()),
                booleanListToString(configViewModel.getOnOffense()),
                booleanListToString(configViewModel.getOnObscenity()),
                booleanListToString(configViewModel.getOnOtherViolation())
        );
    }

    public void mapFields(ConfigViewModel configViewModel, Config existingConfig) {
        existingConfig.setOnThreat(booleanListToString(configViewModel.getOnThreat()));
        existingConfig.setOnOffense(booleanListToString(configViewModel.getOnOffense()));
        existingConfig.setOnObscenity(booleanListToString(configViewModel.getOnObscenity()));
        existingConfig.setOnOtherViolation(booleanListToString(configViewModel.getOnOtherViolation()));
    }

    private String booleanListToString(List<Boolean> options) {
        StringBuilder sb = new StringBuilder();
        for (Boolean isEnabled : options) {
            sb.append(',');
            sb.append(isEnabled ? 1 : 0);
        }
        return sb.substring(1);
    }
}
