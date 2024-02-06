public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;


    public boolean isOn() {
        return isOn;

    }

    public void powerOn() {
        isOn = true;
    }

    public void powerOff() {
        isOn = false;
    }

    public void accelerate() {
        if (isOn) {
            if (speed >= 0 && speed < 20) {
                speed++;
            } else if (speed > 20 && speed <= 30) {
                speed += 2;
            } else if (speed > 30 && speed <= 40) {
                speed += 3;
            } else if (speed > 40) {
                speed += 4;
            }
        }


    }

    public int getBikeSpeed() {

        return speed;
    }

    public void deccelerate() {
        if (isOn()) {
            if (speed >= 0 && speed < 20) {
                speed--;
            } else if (speed > 20 && speed <= 30) {
                speed -= 2;
            } else if (speed > 30 && speed <= 40) {
                speed -= 3;
            } else if (speed > 40) {
                speed -= 4;
            }
        }
    }

    public int switchGear() {
        if (isOn()) {
                if (speed >= 0 && speed < 20)
                   gear = 1;

                if (speed > 20 && speed <= 30)
                   gear = 2;

                if (speed > 30 && speed <= 40)
                    gear = 3;

                if (speed > 40)
                    gear = 4;


                    }
                    return gear;
                }
            }






