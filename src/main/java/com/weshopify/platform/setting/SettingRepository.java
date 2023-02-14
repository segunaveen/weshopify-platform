package com.weshopify.platform.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.weshopify.platform.entity.setting.Setting;
import com.weshopify.platform.entity.setting.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
