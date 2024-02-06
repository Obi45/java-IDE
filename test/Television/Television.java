package Television;

public class Television {
    private int volume;
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void PowerOn() {
        isOn = true;
    }

    public void powerOff() {
        isOn = false;
    }

    public void increaseVolume() {
        if (isOn) {
            if (volume >= 1 && volume <= 100)
                volume++;
        }
    }
    public int getIncreaseVolume(){
          return volume;
    }

    public void decreaseVolume() {
        if(isOn){
            if(volume >= 100 && volume <= 1)
                volume--;
        }
    }
    public int getDecreaseVolume(){
        return volume;
    }
}


