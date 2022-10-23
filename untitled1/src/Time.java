public class Time {
    int second;
    int minite;
    int houre;

    public Time() {
        houre = 0;
        minite = 0;
        second = 0;
    }

    public Time(int houre,int minite,int second) {
        if(isValid(second)){
            this.second = second;
        }
        if (isValid(minite)){
            this.minite = minite;
        }
        this.houre = houre%24;
    }

    public String toString() {
        return houre+":"+minite+":"+second;
    }

    public boolean isValid(int num) {
        return (num >= 0 && num <= 60);
    }
}
