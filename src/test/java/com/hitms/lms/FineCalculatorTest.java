package com.hitms.lms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Checks the grace period, the daily rate and the cap.
 */
class FineCalculatorTest {

    private final FineCalculator calculator = new FineCalculator();

    @Test
    void insideGracePeriodCostsNothing() {
        assertEquals(0.0, calculator.calculateFine(5), 0.001);
    }

    @Test
    void beyondGracePeriodChargesPerDay() {
        assertEquals(2.5, calculator.calculateFine(10), 0.001);
    }

    @Test
    void fineIsCapped() {
        assertEquals(20.0, calculator.calculateFine(100), 0.001);
    }

    @Test
    void negativeOverdueCostsNothing() {
        assertEquals(0.0, calculator.calculateFine(-3), 0.001);
    }
}
