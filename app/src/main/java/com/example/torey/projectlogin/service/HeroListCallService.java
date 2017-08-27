package com.example.torey.projectlogin.service;

import com.example.torey.projectlogin.model.Hero;
import com.example.torey.projectlogin.model.HeroList;

import retrofit2.Call;
import retrofit2.http.GET;



public interface HeroListCallService {
    @GET("test-mobile/iOS/json/test2.json")
    Call<HeroList> getHeroList();
}
