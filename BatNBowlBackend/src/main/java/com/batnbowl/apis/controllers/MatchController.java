package com.batnbowl.apis.controllers;

import com.batnbowl.apis.entities.Match;
import com.batnbowl.apis.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){

        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping("/table")
    public ResponseEntity<List<List<String>>> getCWC2023PointTable(){
        return new ResponseEntity<>(matchService.getCWC2023PointTable(),HttpStatus.OK);
    }
}
