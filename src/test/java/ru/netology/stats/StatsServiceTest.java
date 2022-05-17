package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAvr() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.avgSales(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMin() {
        StatsService service = new StatsService();

        int[] sales = {8, 7, 13, 15, 7, 20, 19, 20, 77, 14, 14, 50};

        long actual = service.minSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMax() {
        StatsService service = new StatsService();

        int[] sales = {8, 7, 13, 77, 7, 20, 19, 20, 77, 14, 14, 50};

        long actual = service.maxSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountUnderAvr() {
        StatsService service = new StatsService();

        int[] sales = {8, 7, 13, 77, 7, 20, 19, 20, 77, 14, 14, 50};

        long actual = service.countMonthUnderAvg(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountOverAvr() {
        StatsService service = new StatsService();

        int[] sales = {8, 7, 13, 77, 7, 20, 19, 20, 77, 14, 14, 50};

        long actual = service.countMonthOverAvg(sales);
        long expected = 3;

        Assertions.assertEquals(expected, actual);
    }

}
