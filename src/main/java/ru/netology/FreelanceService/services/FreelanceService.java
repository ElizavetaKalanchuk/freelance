package ru.netology.FreelanceService.services;

public class FreelanceService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int vacationMonths = 0;
        int balance = 0;

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold || (income - expenses) * 3 >= threshold) {
                vacationMonths++;
                balance -= expenses;
                balance = balance > 0 ? balance / 3 : 0;
            } else {
                balance += income - expenses;
            }
        }
        return vacationMonths;
    }
}