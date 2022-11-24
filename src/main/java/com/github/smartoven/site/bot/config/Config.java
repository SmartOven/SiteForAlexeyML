package com.github.smartoven.site.bot.config;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bot")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private Long chatId;

    // Looks like: "1,1,0"
    //       Mean: delete=true, mute=true, ban=false
    private String onThreat;
    private String onOffense;
    private String onObscenity;
    private String onOtherViolation;
}
