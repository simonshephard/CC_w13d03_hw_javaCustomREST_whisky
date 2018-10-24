package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;

import java.util.List;

public interface DistilleryRepositoryCustom {

    public List<Distillery> getDistilleriesFromRegion(String region);
    public List<Distillery> getDistilleriesWithWhiskiesAge12();

}
