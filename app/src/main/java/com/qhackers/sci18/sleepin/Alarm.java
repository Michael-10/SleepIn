package com.qhackers.sci18.sleepin;

/**
 * Class to hold information about an alarm.
 */
public class Alarm {

    private int hour;
    private int minute;
    private boolean isSet;      // Toggle the alarm on or off
    private boolean vibrate;    // Vibrate phone when the alarm goes off
    private String alarmName;   // Name of the alarm (optional)
    private String id;          // Key of the alarm to be stored in SharedPreferences

    public Alarm(int hour, int minute, boolean isSet, boolean vibrate, String alarmName, String id) {
        this.hour = hour;
        this.minute = minute;
        this.isSet = isSet;
        this.vibrate = vibrate;
        this.alarmName = alarmName;
        this.id = id;
    }


    public boolean getIsSet() {
        return isSet;
    }

    public void setIsSet(boolean set) {
        isSet = set;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public boolean isVibrate() {
        return vibrate;
    }

    public void setVibrate(boolean vibrate) {
        this.vibrate = vibrate;
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
