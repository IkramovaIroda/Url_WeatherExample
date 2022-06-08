package org.example.Curency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.Curency.dto.Clouds;
import org.example.Curency.dto.Main;
import org.example.Curency.dto.Sys;
import org.example.Curency.dto.Wind;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
    public class WeatherDTO {
        private org.example.Curency.dto.coord coord;
        private org.example.Curency.dto.weather weather;
        private String base;
        private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;

    private long dt;
    private Sys sys;
    private long timezone;
    private long id;
    private String name;
    private int cod;

    }
