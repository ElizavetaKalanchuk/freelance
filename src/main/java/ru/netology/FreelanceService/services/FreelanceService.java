package ru.netology.FreelanceService.services;

public class FreelanceService {  // Явное объявление класса
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int vacationMonths = 0;
        int balance = 0;

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                vacationMonths++;
                balance -= expenses;
                balance /= 3;
            } else {
                balance += income - expenses;
            }
        }
        return vacationMonths;
    }
}