package com.github.smartoven.site.bot.config;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigRepository extends JpaRepository<Config, Long> {
    Optional<Config> findByChatId(Long chatId);
    boolean existsByChatId(Long chatId);
}
