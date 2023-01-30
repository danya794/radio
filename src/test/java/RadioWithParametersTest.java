import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioWithParametersTest {

    @Test
    public void testCurrentRadioStationWithParameter() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRadioStationWithParameter() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRadioStationAnotherStationWithParameter() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);

        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRadioStationWithParameter() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(-1);

        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRadioStationAnotherStationWithParameter() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(5);

        radio.prevRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolume() {
        Radio radio = new Radio(100);

        radio.setCurrentVolume(11);

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testIncreaseVolumeExceptLimitWithParameter() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(-1);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeWithParameter() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeEqualWithParameter() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testDecreaseVolumeWithParameter() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(5);

        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeNothingHappenedWithParameter() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(101);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
