package ru.netology.service;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void TestRemainFor1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount); //вызвали метод remain, он возвращает сумму, на кот. надо докупить
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashbackFor900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashbackFor999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        org.junit.Assert.assertEquals(expected, actual);
    }
}
