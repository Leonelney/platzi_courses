package com.platzi.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void loseWhenDIceNumberIsTooLow() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.Roll()).thenReturn(3);
        Player player = new Player(dice, 5);
        assertFalse(player.Play());
    }

    @Test
    public void winWhenDIceNumberIsTooLow() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.Roll()).thenReturn(4);
        Player player = new Player(dice, 3);
        assertTrue(player.Play());
    }
}