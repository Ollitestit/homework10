package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetQuantityStationByUser() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(10, radio.getQuantityStation());
    }

    @Test
    public void shouldSetQuantityStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(20, radio.getQuantityStation());
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        Assertions.assertEquals(15, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(19, radio.getMaxStation());
    }

    @Test
    public void shouldSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(20);
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        Assertions.assertEquals(1, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNextStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(19);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(19);
        radio.prev();
        Assertions.assertEquals(18, radio.getCurrentStation());

    }

    @Test
    public void shouldSetPrevStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prev();
        Assertions.assertEquals(19, radio.getMaxStation());

    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(100, radio.getMaxVolume());

    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.turnDownVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldTurnDownVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}