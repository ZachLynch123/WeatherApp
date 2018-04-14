package nteractivetory.com.example.android.weatherapp.weather;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import nteractivetory.com.example.android.weatherapp.R;

public class Current {

    // variables for each element from the api's JSON formatted data
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;

    // getters and setters for each variable for other classes to use
    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId(){

        return Forecast.getIconId(mIcon);
    }

    public long getTime() {
        return mTime;
    }

    // formatted time to display actual readable time, not UNIX time
    public String getFormattedTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);
        return timeString;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {

        // gets temp, rounds it to the nearest integer
        return (int) Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double mHumidity) {
        this.mHumidity = mHumidity;
    }

    public int getPrecipChance() {

        // displays precipitation chance as a rounded percentage
        double precipPercentage = mPrecipChance * 100;
        return (int) Math.round(precipPercentage);
    }
    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
