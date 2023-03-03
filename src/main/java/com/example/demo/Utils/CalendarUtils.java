package com.example.demo.Utils;

import java.util.Locale;

public class CalendarUtils {
    int calculateDaysInMonth(int month, int year) {
        return java.time.YearMonth.of(year, month).lengthOfMonth();
    }

    int getYearFromDate(Locale dare)throws Exception {
        return java.time.LocalDate.parse(dare.toString()).getYear();
    }

}
