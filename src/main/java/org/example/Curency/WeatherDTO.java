package org.example.Curency;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.Curency.dto.Clouds;
import org.example.Curency.dto.Main;
import org.example.Curency.dto.Wind;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
    public class WeatherDTO {
//    @SerializedName("coord")
        private org.example.Curency.dto.coord coord;
 //   @SerializedName("weather")
        private org.example.Curency.dto.weather weather;
  //  @SerializedName("base")
        private String base;
   // @SerializedName("main")
        private Main main;
   // @SerializedName("visibility")
    private int visibility;
   // @SerializedName("wind")
    private Wind wind;
   // @SerializedName("clouds")
    private Clouds clouds;
   // @SerializedName("dt")
    private long dt;
//    @SerializedName("timezone")
    private long timezone;
   // @SerializedName("id")
    private long id;
   // @SerializedName("name")
    private String name;
   // @SerializedName("cod")
    private int cod;

    }
