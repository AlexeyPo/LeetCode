package org.example.array_string._121_best_time_to_buy_and_sell_stock;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock stockSolver = new BestTimeToBuyAndSellStock();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void maxProfitShouldReturnFive() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expectedProfit = 5;
        int actualProfit = stockSolver.maxProfit(prices);
        assertEquals(expectedProfit, actualProfit);
    }

    @Test
    void maxProfitShouldReturnZero() {
        int[] prices = {7, 6, 4, 3, 1};
        int expectedProfit = 0;
        int actualProfit = stockSolver.maxProfit(prices);
        assertEquals(expectedProfit, actualProfit);
    }
}