package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    public List<Whisky> getWhiskiesForYear(int year);
    public List<Whisky> getWhiskiesFromRegion(String region);
    public List<Whisky> getWhiskiesFromDistilleryOfAge(Long distilleryId, int age);

}
