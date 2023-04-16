package com.oop.iotapp;

public class TemperatureData {
    private Long id, userId, status, temperature, fanSpeed, ecoMode, timerMode;
    private String timerStart, timerStop;

    public TemperatureData(){
        this.id = 0L;
        this.userId = 0L;
        this.status = 0L;
        this.temperature = 0L;
        this.fanSpeed = 0L;
        this.ecoMode = 0L;
        this.timerMode = 0L;
        this.timerStart = "#";
        this.timerStop = "#";
    }

    public TemperatureData(Long id, Long userId, Long status, Long temperature, Long fanSpeed, Long ecoMode, Long timerMode, String timerStart, String timerStop) {
        this.userId = userId;
        this.status = status;
        this.temperature = temperature;
        this.fanSpeed = fanSpeed;
        this.ecoMode = ecoMode;
        this.timerMode = timerMode;
        this.timerStart = timerStart;
        this.timerStop = timerStop;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getTemperature() {
        return temperature;
    }

    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }

    public Long getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(Long fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public Long getEcoMode() {
        return ecoMode;
    }

    public void setEcoMode(Long ecoMode) {
        this.ecoMode = ecoMode;
    }

    public Long getTimerMode() {
        return timerMode;
    }

    public void setTimerMode(Long timerMode) {
        this.timerMode = timerMode;
    }

    public String getTimerStart() {
        return timerStart;
    }

    public void setTimerStart(String timerStart) {
        this.timerStart = timerStart;
    }

    public String getTimerStop() {
        return timerStop;
    }

    public void setTimerStop(String timerStop) {
        this.timerStop = timerStop;
    }
}
