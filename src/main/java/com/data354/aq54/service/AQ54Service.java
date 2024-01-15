package com.data354.aq54.service;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AQ54Service {

    private final WebClient webClient;

    public AQ54Service(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> getCurrentValues(String station_name){

        return webClient.get()
                .uri("/getCurrentValues/{station_name}", station_name)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);

    }

    public Mono<String> getHourlyAvg(String station_name, String dt_from_string, String dt_to_string){

        return webClient.get()
                .uri("/getHourlyAvg/{station_name}/{dt_from_string}/{dt_to_string}",
                        station_name, dt_from_string, dt_to_string)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> getRange(String station_name, String dt_from_string, String dt_to_string){

        return webClient.get()
                .uri("/getRange/{station_name}/{dt_from_string}/{dt_to_string}",
                        station_name, dt_from_string, dt_to_string)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> getSessionInfo(String project_name){

        return webClient.get()
                .uri("/getSessionInfo/{project_name}", project_name)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> getSingleDay(String station_name, String dt_from_string){

        return webClient.get()
                .uri("/getSingleDay/{station_name}/{dt_from_string}", station_name, dt_from_string)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> getStationStatus(String station_id){

        return webClient.get()
                .uri("/getStationStatus/{station_id}", station_id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);

    }

    public Mono<String> getStation(String project_name){

        return webClient.get()
                .uri("/getStations/{project_name}", project_name)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);

    }

    public Mono<String> v3getStationHourlyAvg(String station_id){

        return webClient.get()
                .uri("/v3/getStationHourlyAvg/{station_id}", station_id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }

}
