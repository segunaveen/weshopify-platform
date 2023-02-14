package com.weshopify.platform.setting.country;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.weshopify.platform.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
	public List<Country> findAllByOrderByNameAsc();
}
