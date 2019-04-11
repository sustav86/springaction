package com.sustav.springinaction;

public class BraveKnight implements Knight {

    private Quest quest;
//    private Minstrel minstrel;

//    public BraveKnight(Quest quest, Minstrel minstrel) {
//        this.quest = quest;
//        this.minstrel = minstrel;
//    }

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public BraveKnight() {
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
