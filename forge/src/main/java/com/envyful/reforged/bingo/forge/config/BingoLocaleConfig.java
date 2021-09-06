package com.envyful.reforged.bingo.forge.config;

import com.envyful.api.config.data.ConfigPath;
import com.envyful.api.config.yaml.AbstractYamlConfig;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;

import java.nio.file.Path;

@ConfigPath("config/ReforgedBingo/locale.yml")
@ConfigSerializable
public class BingoLocaleConfig extends AbstractYamlConfig {

    private String cardReset = "&e&l(!) &eYour bingo card was just reset!\n&7You have 24 hours to complete it. Good luck!";
    private String slotCompleteMessage = "&e&l(!) &eWell done, you just completed a slot on your bingo card!";
    private String lineCompleteMessage = "&e&l(!) &eWell done, you just completed a line on your bingo card!";
    private String cardCompleteMessage = "&e&l(!) &eWell done, your entire bingo card!";

    public BingoLocaleConfig() {
        super();
    }

    public String getCardReset() {
        return this.cardReset;
    }

    public String getSlotCompleteMessage() {
        return this.slotCompleteMessage;
    }

    public String getLineCompleteMessage() {
        return this.lineCompleteMessage;
    }

    public String getCardCompleteMessage() {
        return this.cardCompleteMessage;
    }
}