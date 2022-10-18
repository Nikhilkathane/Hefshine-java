package core_java;

public class grosssallery {
    public static void main(String args[]) {
        int basicsallery = 8000;
        double grosssallery = 0;
        if (basicsallery <= 10000) {
            grosssallery = basicsallery + (basicsallery * 20) / 100 + (basicsallery * 80) / 100;
        } else if (basicsallery <= 20000) {
            grosssallery = basicsallery + (basicsallery * 25) / 100 + (basicsallery * 90) / 100;
        } else {
            grosssallery = basicsallery + (basicsallery * 30) / 100 + (basicsallery * 95) / 100;
        }
        System.out.println(grosssallery);
    }
}