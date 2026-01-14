package org.example.array_string._122_best_time_to_buy_and_sell_stock_second;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockSecondTest {

    BestTimeToBuyAndSellStockSecond stockSolver = new BestTimeToBuyAndSellStockSecond();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void maxProfitShouldReturnSeven() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expectedProfit = 7;
        int actualProfit = stockSolver.maxProfit(prices);
        assertEquals(expectedProfit, actualProfit, "Expected profit should be 7 for given prices");
    }

    @Test
    void maxProfitShouldReturnZero() {
        int[] prices = {7, 6, 4, 3, 1};
        int expectedProfit = 0;
        int actualProfit = stockSolver.maxProfit(prices);
        assertEquals(expectedProfit, actualProfit, "Expected profit should be 0 for given prices");
    }

    @Test
    void maxProfitShouldReturnFour() {
        int[] prices = {1, 2, 3, 4, 5};
        int expectedProfit = 4;
        int actualProfit = stockSolver.maxProfit(prices);
        assertEquals(expectedProfit, actualProfit, "Expected profit should be 4 for given prices");
    }
}