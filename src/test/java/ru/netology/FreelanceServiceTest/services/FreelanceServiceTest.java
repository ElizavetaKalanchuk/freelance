package ru.netology.FreelanceServiceTest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.FreelanceService.services.FreelanceService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelanceServiceTest {  // Явное объявление класса
    @Test
    public void testExample1() {
        FreelanceService service = new FreelanceService();
        assertEquals(3, service.calculateVacationMonths(10_000, 3_000, 20_000));
    }

    @Test
    public void testExample2() {
        FreelanceService service = new FreelanceService();
        assertEquals(2, service.calculateVacationMonths(100_000, 60_000, 150_000));
    }

    @Test
    public void testAllVacation() {
        FreelanceService service = new FreelanceService();
        assertEquals(8, service.calculateVacationMonths(50_000, 10_000, 10_000));
    }
}

