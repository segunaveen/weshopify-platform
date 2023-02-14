package com.weshopify.platform.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.weshopify.platform.entity.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
	
	public List<Currency> findAllByOrderByNameAsc();
}
