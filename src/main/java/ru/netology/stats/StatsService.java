package ru.netology.stats;

public class StatsService {

    public long sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long avgSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int minSales(int[] sales) {
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mini]) {
                mini = i;
            }
        }
        mini++;
        return mini;
    }

    public int maxSales(int[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }
        }
        maxi++;
        return maxi;
    }

    public long countMonthUnderAvg(int[] sales) {
        long avg = avgSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public long countMonthOverAvg(int[] sales) {
        long avg = avgSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}
