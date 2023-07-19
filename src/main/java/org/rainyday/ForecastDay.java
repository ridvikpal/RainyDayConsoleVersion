package org.rainyday;

import java.util.ArrayList;

public class ForecastDay {
    private String date;
    private int date_epoch;
    private Astro astro;
    private Day day;
    ArrayList<Hour> hour;

    @Override
    public String toString() {
        return "ForecastDay{" +
                "date='" + date + '\'' +
                ", date_epoch=" + date_epoch +
                ", astro=" + astro +
                ", day=" + day +
                ", hour=" + hour +
                '}';
    }
}
