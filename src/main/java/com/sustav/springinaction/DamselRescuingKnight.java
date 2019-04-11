package com.sustav.springinaction;

public class DamselRescuingKnight implements Knight {

    private Quest quest;

    public DamselRescuingKnight() {
        Quest quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
