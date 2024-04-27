package com.online.store.cs489.service;

import com.online.store.cs489.domain.Advertisement;

import java.util.List;

public interface AdvertisementService {
    List<Advertisement> findAllAds();

    void save(Advertisement ads);

    List<Advertisement> saveAllAds(List<Advertisement> advertisementList);

    Advertisement getActiveAdvertisement();



}

