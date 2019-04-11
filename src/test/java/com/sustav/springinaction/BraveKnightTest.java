package com.sustav.springinaction;

import org.junit.jupiter.api.Test;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class BraveKnightTest {

    @Test
    void embarkOnQuest() {
        Quest quest = mock(Quest.class);

        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
        braveKnight.embarkOnQuest();

        verify(quest, times(2)).embark();
    }
}