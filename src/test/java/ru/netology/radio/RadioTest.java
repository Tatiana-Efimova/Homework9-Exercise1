package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.setCurrentRadioStation(10);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.setCurrentRadioStation(-1);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.next();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationForMaximum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationForMinimum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        int expected = 20;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        radio.setCurrentVolume(120);
        int expected = 20;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(25);
        radio.setCurrentVolume(-10);
        int expected = 25;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        radio.increaseVolume();
        int expected = 31;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeIncreaseForMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        radio.decreaseVolume();
        int expected = 29;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeDecreaseForMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
