package com.ride2go.r2gapi.mapper;

import com.ride2go.r2gapi.api.dto.DemandDto;
import com.ride2go.r2gapi.api.dto.TripDto;
import org.springframework.stereotype.Component;

@Component
public class DemandMapper extends MarkerMapper<DemandDto> {

    public DemandMapper(TripMapper tripMapper) {
        super(tripMapper);
    }

    @Override
    public DemandDto map(TripDto trip) {
        return trip.getDemand();
    }
}