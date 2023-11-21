package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ArithmeticProgressionTest {
    @Test
    void shouldBeOne(){
        int input = 1;

        int result = new ArithmeticProgression().progression(input);

        Assertions.assertEquals(1,result);
    }
    @BeforeEach
    @Test
    void shouldBeSix() {
        int input = 3;

        int result = new ArithmeticProgression().progression(input);

        Assertions.assertEquals(6, result);
    }
    @BeforeEach
    @Test
    void shouldBeException(){
        int input = 0;

        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new ArithmeticProgression().progression(input);
        });
    }
}