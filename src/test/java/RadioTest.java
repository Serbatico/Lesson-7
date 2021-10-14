import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setNextStation() {
        Radio next = new Radio();
        int actual = next.setNextStation();
        int expected = 1;
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
        next.setCurrentStation = 9;
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
        prev.setCurrentStation = 9;
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
        prev.setCurrentStation = 0;
        int actual = prev.setPrevStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void setStation() {

        Radio station = new Radio();

        // Указываем нужный номер радиостанции
        station.setNewStation = 5;
        int actual = station.setNewStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void setStationOverLimit() {

        Radio station = new Radio();

        // Указываем нужный номер радиостанции превышающей высшую границу
        station.setNewStation = 10;
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
        increaseVolume.setCurrentVolume = 10;
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
        increaseVolumeToMax.setCurrentVolume = 10;
        int actual = increaseVolumeToMax.increaseVolumeMax();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMin() {

        Radio volume = new Radio();

        volume.setCurrentVolume = volume.minVolume;
        int actual = volume.setCurrentVolume;
        int expected = 0;
        assertEquals(expected, actual);
    }
}