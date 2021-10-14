
public class Radio {
    int setCurrentStation = 0; //№ станции на данный момент
    int maxStation = 9; //Максимальное кол-во станций
    int minStation = 0;//Минимальное кол-во станций
    int setNewStation = 0; //№ Выбранной станции
    int setCurrentVolume = 0;//Выбранный уровень громкости на данный момент
    int maxVolume = 10;//Максимальный уровень звука
    int minVolume = 0;//Минимальный уровень звука

    //Следующая станция
    public int setNextStation() {
        int next = setCurrentStation + 1;
        if (next > maxStation) {
            next = 0;
        }
        return next;
    }

    //Предыдущая станция
    public int setPrevStation() {
        int prev = setCurrentStation - 1;
        if (prev < minStation) {
            prev = 9;
        }
        return prev;
    }

    //Выбрать станцию по №
    public int setNewStation() {
        int newStation = setNewStation;
        if (newStation > maxStation) {
            newStation = maxStation;
        }
        return newStation;
    }

    public int increaseVolume() {
        if (setCurrentVolume < maxVolume) {
            setCurrentVolume = setCurrentVolume + 1;
        }
        return setCurrentVolume;
    }

    public int increaseVolumeMax(){
        if (setCurrentVolume < maxVolume){
            setCurrentVolume = maxVolume;
        }
        return setCurrentVolume;
    }
}