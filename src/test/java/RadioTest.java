import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setNextStation() {
        Radio next = new Radio();
        next.currentStation = 6;
        int actual = next.setNextStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void setNextStationMiddle() {
        Radio next = new Radio();
        int actual = 4 + next.setNextStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void setNextStationOver() {
        Radio next = new Radio();
        next.currentStation = 9;
        int actual = next.setNextStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void setPrevStation() {

        Radio prev = new Radio();
        int actual = prev.setPrevStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void setPrevStationFromCurrent() {

        Radio prev = new Radio();
        prev.currentStation = 9;
        int actual = prev.setPrevStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void setPrevStationMiddle() {

        Radio prev = new Radio();
        int actual = 9 - prev.setPrevStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setPrevStationOver() {

        Radio prev = new Radio();
        prev.currentStation = 0;
        int actual = prev.setPrevStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void setStation() {

        Radio station = new Radio();
        // Указываем нужный номер радиостанции
        station.currentStation = 5;
        int actual = station.setNewStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void setStationOverLimit() {

        Radio station = new Radio();

        // Указываем нужный номер радиостанции превышающей высшую границу
        station.currentStation = 10;
        int actual = station.setNewStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {

        Radio increaseVolume = new Radio();

        int actual = increaseVolume.increaseVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeOver() {

        Radio increaseVolume = new Radio();
        increaseVolume.currentVolume = 10;
        int actual = increaseVolume.increaseVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeToMax() {

        Radio increaseVolumeToMax = new Radio();

        int actual = increaseVolumeToMax.increaseVolumeMax();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeToMaxFromCurrent() {

        Radio increaseVolumeToMax = new Radio();
        increaseVolumeToMax.currentVolume = 10;
        int actual = increaseVolumeToMax.increaseVolumeMax();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeToMin() {

        Radio decreaseVolumeToMin = new Radio();
        decreaseVolumeToMin.currentVolume = 2;
        int actual = decreaseVolumeToMin.decreaseVolumeMin();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeToMinFromCurrent() {

        Radio decreaseVolumeToMin = new Radio();
        decreaseVolumeToMin.currentVolume = 0;
        int actual = decreaseVolumeToMin.decreaseVolumeMin();
        int expected = 0;
        assertEquals(expected, actual);
    }
}