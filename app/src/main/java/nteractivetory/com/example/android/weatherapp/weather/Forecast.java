package nteractivetory.com.example.android.weatherapp.weather;

/**
 * Created by Allison on 4/6/2018.
 */

public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForecast;
    private Daily[] mDailyForecast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public Daily[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Daily[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }
}
