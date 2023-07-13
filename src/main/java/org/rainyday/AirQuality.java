package org.rainyday;

import com.google.gson.annotations.SerializedName;

import java.util.StringJoiner;

public class AirQuality{
    private double co, no2, o3, so2, pm2_5, pm10;
    @SerializedName("us-epa-index")
    private int us_epa_index;

    @SerializedName("gb-defra-index")
    private int gb_defra_index;

    // GETTERS
    public double getCo() {
        return co;
    }

    public double getNo2() {
        return no2;
    }

    public double getO3() {
        return o3;
    }

    public double getSo2() {
        return so2;
    }

    public double getPm2_5() {
        return pm2_5;
    }

    public double getPm10() {
        return pm10;
    }

    public int getUs_epa_index() {
        return us_epa_index;
    }

    public int getGb_defra_index() {
        return gb_defra_index;
    }

    // toString method overloading
    public String toString(){
        return new StringJoiner("\n\t\t\t", "(\n\t\t\t", "\n\t\t\t)")
                .add("co=" + this.getCo())
                .add("no2=" + this.getNo2())
                .add("o3=" + this.getO3())
                .add("so2=" + this.getSo2())
                .add("pm2_5=" + this.getPm2_5())
                .add("pm10=" + this.getPm10())
                .add("us-epa-index=" + this.getUs_epa_index())
                .add("gb-defra-index=" + this.getGb_defra_index())
                .toString();
    }
}