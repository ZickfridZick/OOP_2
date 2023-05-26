package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSwitchToNextStationWhenNotAtMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToFirstStationWhenAtMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToPreviousStationWhenNotAtMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prevStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToLastStationWhenAtMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetValidStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetInvalidStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(15); // Invalid station number
        assertEquals(0, radio.getCurrentStation()); // Should remain at current station
    }

    @Test
    public void shouldIncreaseVolumeWhenNotAtMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeWhenAtMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100); // Max volume
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume()); // Should remain at max volume
    }

    @Test
    public void shouldDecreaseVolumeWhenNotAtMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        radio.decreaseVolume();
        assertEquals(29, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeWhenAtMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0); // Min volume
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume()); // Should remain at min volume
    }
    @Test
    public void shouldSetValidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetInvalidVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10); // Below min volume
        assertEquals(0, radio.getCurrentVolume()); // Should remain at min volume
    }

    @Test
    public void shouldSetValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetInvalidStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1); // Below min station
        assertEquals(0, radio.getCurrentStation()); // Should remain at min station
    }
    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldNotSetInvalidVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110); // Above max volume
        assertEquals(0, radio.getCurrentVolume()); // Should remain at max volume
    }

}

