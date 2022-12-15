package com.worxbox.blockchain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HashCalculatorTest {
    @Test
    void testHello() {
        var sha = HashCalculator.calculateToHex("Hello Duke");
        Assertions.assertTrue(sha.equals("03208e62b5d8c52451191305f775f17c81037d2d37458ee9fd002c4841141ded"));
    }
}