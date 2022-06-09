package org.example.Curency;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


public class WeatherMain {
  static   JsonParser parser = new JsonParser();
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
   Gson gson = new Gson();

// 1 способ
        JsonObject jo =parser.parse(stringBuilder.toString()).getAsJsonObject();
        JsonObject location = jo.get("location").getAsJsonObject();
        JsonObject current = jo.get("current").getAsJsonObject();
        String cityName = location.get("name").getAsString();
        Double tempC = current.get("temp_c").getAsDouble();


//        WeatherDTO weatherDTO = gson.fromJson(stringBuilder.toString() , WeatherDTO.class);
//        System.out.println(weatherDTO);

//2 способ
        //   WeatherDTO weatherDTO = gson.<WeatherDTO>fromJson(stringBuilder.toString(), WeatherDTO.class);
       // System.out.println(" " + weatherDTO.getClass());
//        System.out.println("" + weatherDTO.getBase());
//        System.out.println("" + weatherDTO.getMain());
//        System.out.println(" " + weatherDTO.getClouds());
//        System.out.println("" + weatherDTO.getSys());
//        System.out.println("" + weatherDTO.getVisibility());
//        System.out.println("" + weatherDTO.getWind());
//        System.out.println("" + weatherDTO.getClouds());
//        System.out.println("" + weatherDTO.getWeather());
//        System.out.println("" + weatherDTO.getCod());
//        System.out.println("" + weatherDTO.getDt());
//3 способ
        //List<WeatherDTO> weatherDTO = (List<WeatherDTO>) new Gson().fromJson( stringBuilder.toString() , WeatherDTO.class);
}
}
