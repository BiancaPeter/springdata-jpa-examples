package com.springdata.coursecompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private SessionRepository sessionRepository;

    private LocationRepository locationRepository;

    public LocationService(@Autowired SessionRepository sessionRepository,@Autowired LocationRepository locationRepository) {
        this.sessionRepository = sessionRepository;
        this.locationRepository = locationRepository;
    }

    public Location saveLocation(Location location){
        return locationRepository.save(location);
    }

}
