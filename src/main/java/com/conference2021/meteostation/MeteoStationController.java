package com.conference2021.meteostation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MeteoStationController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/meteo")
    public MeteoStation meteo() {
        return new MeteoStation(counter.incrementAndGet());
    }
}
