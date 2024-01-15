package com.data354.aq54;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.data354.aq54.config.AQ54Root.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String BaseHome(){
        return "redirect:" + APP_ROOT;
    }

    @GetMapping(APP_ROOT)
    public String Home() {
        return "index";
    }

    @GetMapping(CURRENTVALUES)
    public String getcurrentvaluesH(){

        return "getcurrentvalues";
    }

    @GetMapping(HOURLYAVG)
    public String hourlyavg(){
        return "getHourlyAvg";
    }

    @GetMapping(RANGE)
    public String range(){
        return "getRange";
    }

    @GetMapping(SESSIONINFO)
    public String sessioninfo(){
        return "getSessionInfo";
    }

    @GetMapping(SINGLEDAY)
    public String singleday(){
        return "getSingleDay";
    }
    @GetMapping(STATION)
    public String station(){
        return "getStation";
    }

    @GetMapping(STATIONSTATUS)
    public String stationstatus(){
        return "getStationStatus";
    }

    @GetMapping(V3STATIONHOURLYAVG)
    public String v3getstationhourlyavg(){
        return "v3getStationHourlyAvg";
    }

}
