package com.data354.aq54.controller.implement;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.data354.aq54.config.AQ54Root.*;

public interface AQ54Interface {

    @GetMapping(CURRENTVALUES+"{station_name}")
    String getCurrentValues(@PathVariable String station_name,RedirectAttributes ra, Model model);
    @GetMapping(HOURLYAVG+"{station_name}/{dt_from_string}/{dt_to_string}")
    String getHourlyAvg(@PathVariable String station_name,@PathVariable String dt_from_string,
                        @PathVariable String dt_to_string, Model model);
    @GetMapping(RANGE+"{station_name}/{dt_from_string}/{dt_to_string}")
    String getRange(@PathVariable String station_name,@PathVariable String dt_from_string,
                    @PathVariable String dt_to_string, Model model);
    @GetMapping(SESSIONINFO+"{project_name}")
    String getSessionInfo(@PathVariable String project_name, Model model) throws JsonProcessingException;
    @GetMapping(SINGLEDAY+"{station_name}/{dt_from_string}")
    String getSingleDay(@PathVariable String station_name,@PathVariable String dt_from_string, Model model);
    @GetMapping(STATIONSTATUS+"{station_id}")
    String getStationStatus(@PathVariable String station_id, Model model) throws JsonProcessingException;
    @GetMapping(STATION+"{project_name}")
    String getStation(@PathVariable String project_name, Model model) throws JsonProcessingException;
    @GetMapping(V3STATIONHOURLYAVG+"{station_id}")
    String v3getStationHourlyAvg(@PathVariable String station_id, Model model);

}
