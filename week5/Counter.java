package week5;

public class Counter {
    int startingValue = 0;
    boolean check = false;


    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.startingValue = startingValue;

    }

    public Counter(boolean check) {
        this.check = check;
    }

    public Counter() {
    }

    public int value() {
        return startingValue;
    }

    public void increase() {
        startingValue++;
    }

    public void decrease(){
        if (this.startingValue >= 0) {
            startingValue--;
        }
    }


}

