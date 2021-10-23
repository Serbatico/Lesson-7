
public class Radio {
    public int currentStation;
    public int currentVolume;//Выбранный уровень громкости на данный момент
    private int getMaxStation(){
        return 9; //Максимальное кол-во станций
    }
    private int getMinStation(){
        return 0; //Минимальное кол-во станций
    }
    private int getMaxVolume(){
        return 10; //Максимальный уровень звука
    }
    private int getMinVolume(){
        return 0; //Минимальный уровень звука
    }

    //Следующая станция
    public int setNextStation() {
        int next = currentStation + 1;
        if (next > getMaxStation()) {
            next = 0;
        }
        return next;
    }

    //Предыдущая станция
    public int setPrevStation() {
        int prev = currentStation - 1;
        if (prev < getMinStation()) {
            prev = 9;
        }
        return prev;
    }

    //Выбрать станцию по №
    public int setNewStation() {
        int newStation = currentStation;
        if (newStation > getMaxStation()) {
            newStation = getMaxStation();
        }
        return newStation;
    }

    public int increaseVolume() {
        if (currentVolume < getMaxVolume()) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int increaseVolumeMax(){
        if (currentVolume < getMaxVolume()){
            currentVolume = getMaxVolume();
        }
        return currentVolume;
    }

    public int decreaseVolumeMin(){
        if (currentVolume > getMinVolume()){
            currentVolume = getMinVolume();
        }
        return currentVolume;
    }

}