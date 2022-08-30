package com.cjl.chapter6.mapper;

import com.cjl.chapter6.model.City;
import org.springframework.stereotype.Component;

@Component
public interface CityMapper {
    City selectCityAndScenics(Long city_id);
}
