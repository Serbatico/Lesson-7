import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setNextStation() {
        Radio next  = new Radio();
        int actual = next.setNextStation();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void setNextStationMiddle() {
        Radio next  = new Radio();
        int actual = 4 + next.setNextStation();
        int expected = 5;

        assertEquals(expected, actual);
    }
    @Test
    void setNextStationOver() {
        Radio next  = new Radio();
        int setCurrentStation = next.setCurrentStation;
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
    void setPrevStationMiddle() {

        Radio prev = new Radio();
        int actual = 9 - prev.setPrevStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void setPrevStationOver() {

        Radio prev = new Radio();
        int setCurrentStation = prev.setCurrentStation;
        prev.setCurrentStation = 0;
        int actual = prev.setPrevStation();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void  setNewStation () {

        Radio station = new Radio();
        int setNewStation = station.setNewStation();
        setNewStation = 9;
        int actual = station.setNewStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
}