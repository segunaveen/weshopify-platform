package com.weshopify.platform.setting.state;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.weshopify.platform.entity.Country;
import com.weshopify.platform.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
