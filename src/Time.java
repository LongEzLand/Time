/**
 * Created by opilane on 19.10.2016.
 */
public class Time {
    public static void main(String[]args){

        int hour=16;
        int minute=30;
        int seconds=15;

        //Excercise 2.3.3
        //The number of seconds since midnight

        System.out.print("The number of seconds since midnight is: ");
        System.out.println((hour * 60 + minute)*60 + seconds+"\n");

        //Excercise 2.3.4
        //Number of seconds remaining in the day

        System.out.print("The number of seconds remaining in the day is: ");
        System.out.println((24*60*60)-((hour * 60 + minute)*60 + seconds)+"\n");

        //Excercise 2.3.5
        //Calculating the percentage of the day that has passed

        int sinceSecons = 59415;
        int remainingSeconds = 26985;

        //Percentage remaining

        System.out.printf("%.3f %.6f", ((float) remainingSeconds/(float) sinceSecons*100),((float) remainingSeconds/(float) sinceSecons*100));// typecasting(data type changes to the one in brackets)










    }
}
