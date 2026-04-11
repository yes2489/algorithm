import java.util.*;

class WeatherForecast {
    String date;
    String day;
    String weather;

    public WeatherForecast(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    @Override
    public String toString(){
        return date + " " + day + " " + weather;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        WeatherForecast[] list = new WeatherForecast[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next(), day = sc.next(), weather = sc.next();
            list[i] = new WeatherForecast(date, day, weather);
        }

        Arrays.sort(list, Comparator.comparing(w -> w.date));

        for (WeatherForecast w : list) {
            if (w.weather.equals("Rain")){
                System.out.println(w);
                break;
            }
        }
    }
}