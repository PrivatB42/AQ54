package com.data354.aq54.controller;

import com.data354.aq54.model.SessionInfo;
import com.data354.aq54.controller.implement.AQ54Interface;
import com.data354.aq54.model.Station;
import com.data354.aq54.model.Stationutc;
import com.data354.aq54.service.AQ54Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class AQ54Controller implements AQ54Interface {

    private final AQ54Service service;

    public AQ54Controller(AQ54Service service) {
        this.service = service;
    }


    @Override
    public String getCurrentValues(String station_name, RedirectAttributes ra, Model model) {

        String flux = service.getCurrentValues(station_name).block();
        /*assert flux != null;
        flux.replaceAll(s -> s
                .replace("{", "")
                .replace("}", "")
                .replace(",", "")
                .replace(" ", ""));*/

        /*String json = null;
        try {
            json = convertListToJson(flux);
            json.replace("\\", "");
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/

        model.addAttribute("flux", flux);
        return "getcurrentvalues";
    }

    @Override
    public String getHourlyAvg(String station_name, String dt_from_string, String dt_to_string, Model model) {

        List<String> flux = service.getHourlyAvg(station_name, dt_from_string,dt_to_string)
                .collectList().block();

        model.addAttribute("flux", flux);
        return "getHourlyAvg";
    }

    @Override
    public String getRange(String station_name, String dt_from_string, String dt_to_string, Model model) {

        String flux = service.getRange(station_name, dt_from_string, dt_to_string).block();
        model.addAttribute("flux", flux);
        return "getRange";
    }

    @Override
    public String getSessionInfo(String project_name, Model model) throws JsonProcessingException {

        String flux = service.getSessionInfo(project_name).block();

        ObjectMapper objectMapper = new ObjectMapper();
        List<SessionInfo> sessionInfoList = objectMapper.readValue(flux, new TypeReference<>() {});

        model.addAttribute("flux", flux);
        model.addAttribute("sessionInfoList", sessionInfoList);
        return "getSessionInfo";
    }

    @Override
    public String getSingleDay(String station_name, String dt_from_string, Model model) {

        String flux = service.getSingleDay(station_name, dt_from_string).block();
        model.addAttribute("flux", flux);
        return "getSingleDay";
    }

    @Override
    public String getStationStatus(String station_id, Model model) throws JsonProcessingException {

        String flux = service.getStationStatus(station_id).block();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Stationutc stationlist = objectMapper.readValue(flux, new TypeReference<>() {});

        model.addAttribute("flux", flux);
        model.addAttribute("stationlist", stationlist);
        return "getStationStatus";
    }

    @Override
    public String getStation(String project_name, Model model) throws JsonProcessingException {

        String flux = service.getStation(project_name).block();

        ObjectMapper objectMapper = new ObjectMapper();
        List<Station> stationlist = objectMapper.readValue(flux, new TypeReference<>() {});

        model.addAttribute("flux", flux);
        model.addAttribute("stationlist", stationlist);
        return "getStation";
    }

    @Override
    public String v3getStationHourlyAvg(String station_id, Model model) {

        String flux = service.v3getStationHourlyAvg(station_id).block();
        model.addAttribute("flux", flux);
        return "v3getStationHourlyAvg";
    }
}
