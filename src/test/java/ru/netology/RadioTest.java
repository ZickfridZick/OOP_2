package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldSetCurrentStationInRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetCurrentStationOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToFirstStationFromLastStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prevStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToLastStationFromFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentVolumeInRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetCurrentVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(80);
        radio.increaseVolume();
        assertEquals(81, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);
        radio.decreaseVolume();
        assertEquals(39, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentStationToMaxStationIfOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStationCorrectly() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(18);
        radio.nextStation();
        assertEquals(19, radio.getCurrentStation());

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());

        radio.prevStation();
        assertEquals(19, radio.getCurrentStation());
    }

    @Test
    public void shouldNotChangeCurrentStationIfMaxStationIsZero() {
        Radio radio = new Radio(0);
        radio.setCurrentStation(5);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotChangeCurrentVolumeIfOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(-10);
        assertEquals(0, radio.getCurrentVolume());
    }
}
