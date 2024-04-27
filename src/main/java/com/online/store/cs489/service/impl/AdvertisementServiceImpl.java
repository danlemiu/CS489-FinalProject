package com.online.store.cs489.service.impl;

import com.online.store.cs489.domain.Advertisement;
import com.online.store.cs489.repository.AdvertisementRepository;
import com.online.store.cs489.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    @Autowired
    private AdvertisementRepository advertisementRepository;

    @Override
    public List<Advertisement> findAllAds() {
        return (List<Advertisement>) advertisementRepository.findAll();
    }

    @Override
    public void save(Advertisement ads) {
        advertisementRepository.save(ads);
    }

    @Override
    public List<Advertisement> saveAllAds(List<Advertisement> advertisementList) {
        return (List<Advertisement>) advertisementRepository.saveAll(advertisementList);
    }

    @Override
    public Advertisement getActiveAdvertisement() {
        return advertisementRepository.getActiveAds();
    }
}
