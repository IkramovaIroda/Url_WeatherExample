package org.example.Curency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class WeatherMain {
    public static void main(String[] args) throws IOException {
    URL url = new URL("https://api.openweathermap.org/data/2.5/weather?lat=41.311081&lon=69.240562&appid=c1bfbf2e4b102a8e72480b3754321694");
    URLConnection connection = url.openConnection();
    InputStream stream = connection.getInputStream();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
    StringBuilder stringBuilder = new StringBuilder();
    String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
        stringBuilder.append(line);
        line = bufferedReader.readLine();
    }
//    Gson gson = new Gson();
//    CurrensyDTO currensyDTO = gson.fromJson(stringBuilder.toString(), CurrensyDTO.class);
//        System.out.println("id: " + currensyDTO.getId());
//        System.out.println("Code: " + currensyDTO.getBase());
//        System.out.println("Ccy: " + currensyDTO.getMain());
//        System.out.println("CcyNm_RU: " + currensyDTO.getClouds());
//        System.out.println("CcyNm_UZ: " + currensyDTO.getSys());
//        System.out.println("CcyNm_UZC: " + currensyDTO.getVisibility());
//        System.out.println("CcyNm_EN: " + currensyDTO.getWind());
//        System.out.println("Nominal: " + currensyDTO.getClouds());
//        System.out.println("Rate: " + currensyDTO.getWeather());
//        System.out.println("Diff: " + currensyDTO.getCod());
//        System.out.println("Date: " + currensyDTO.getDt());
}
}
