package com.hitms.lms;

/**
 * Works out the fine charged on an overdue item.
 *
 * <p>The grace period, the daily rate and the cap used to be bare numbers
 * inside one long method. They are named constants now, and each rule lives in
 * its own small method.</p>
 */
public class FineCalculator {

    /** Days after the due date before any fine starts. */
    private static final int GRACE_PERIOD_DAYS = 5;

    /** What one chargeable day costs. */
    private static final double FINE_PER_DAY = 0.5;

    /** The most any one loan can ever cost. */
    private static final double MAX_FINE = 20.0;

    /**
     * Returns the fine for an item that is this many days overdue.
     *
     * @param daysOverdue how many days past the due date the item is
     * @return the fine, never above the cap
     */
    public double calculateFine(int daysOverdue) {
        int chargeableDays = chargeableDays(daysOverdue);
        double fine = chargeableDays * FINE_PER_DAY;
        return capFine(fine);
    }

    /**
     * Returns the days that actually cost money.
     *
     * @param daysOverdue how many days past the due date the item is
     * @return the days beyond the grace period, never negative
     */
    private int chargeableDays(int daysOverdue) {
        return Math.max(0, daysOverdue - GRACE_PERIOD_DAYS);
    }

    /**
     * Clamps a fine to the maximum the library will charge.
     *
     * @param fine the fine before the cap is applied
     * @return the fine, never above the cap
     */
    private double capFine(double fine) {
        return Math.min(fine, MAX_FINE);
    }
}
