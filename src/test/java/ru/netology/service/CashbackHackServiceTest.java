package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void cashbackNotRecommended1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void cashbackRecommended999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void cashbackNotRecommended1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void cashbackRecommended() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void cashbackRecommended899() {
        CashbackHackService service = new CashbackHackService();
        int amount = 899;

        int actual = service.remain(amount);
        int expected = 101;

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void cashbackRecommended901() {
        CashbackHackService service = new CashbackHackService();
        int amount = 901;

        int actual = service.remain(amount);
        int expected = 99;

        org.junit.Assert.assertEquals(actual, expected);

    }

}
