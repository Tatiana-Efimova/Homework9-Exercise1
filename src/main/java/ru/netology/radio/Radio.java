package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation <= 9) {
            if (newRadioStation >= 0) {
                currentRadioStation = newRadioStation;
            }
        }
    }
    public void next() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }
    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }



    private int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0) {
            if (newCurrentVolume <= 100) {
                currentVolume = newCurrentVolume;
            }
        }
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
