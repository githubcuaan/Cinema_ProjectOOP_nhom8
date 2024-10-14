package com.raven.datechooser;

import java.util.Calendar;
import java.util.Date;

public class SelectedDate {

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public SelectedDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public SelectedDate() {
    }

    public Date toDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Lưu ý: tháng trong Calendar bắt đầu từ 0
        return calendar.getTime();
    }

    private int day;
    private int month;
    private int year;
}
