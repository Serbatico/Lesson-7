
public class Radio {
    int setCurrentStation = 0;
    int maxStation = 9;
    int minStation = 0;
    int setNewStation = 0;


    public int  setNextStation() {
        int next = setCurrentStation + 1;
        if (next > maxStation) {
             next = 0;
        }
        return next;
    }

    public int  setPrevStation() {
        int prev = setCurrentStation - 1;
        if (prev < minStation) {
            prev =  9;
        }
        return prev;
    }

    public int setNewStation(){
    int newStation = setNewStation;
        if (newStation > maxStation){
        newStation = maxStation;
    }
        return newStation;
    }
}