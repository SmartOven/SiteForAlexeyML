package com.github.smartoven.site.bot.config;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConfigViewModel {
    private Long chatId;
    private List<Boolean> onThreat;
    private List<Boolean> onOffense;
    private List<Boolean> onObscenity;
    private List<Boolean> onOtherViolation;
}
