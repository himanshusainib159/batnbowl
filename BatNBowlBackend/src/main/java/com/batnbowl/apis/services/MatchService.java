package com.batnbowl.apis.services;

import com.batnbowl.apis.entities.Match;

import java.util.List;

public interface MatchService {

    List<Match> getAllmatches();

    List<Match> getLiveMatches();

    List<List<String>> getCWC2023PointTable();

}
