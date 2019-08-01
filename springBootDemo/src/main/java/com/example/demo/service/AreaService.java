package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Area;

public interface AreaService {
	List<Area> getAreaList();
	Area getAreaById(int areaId);
	int addArea(Area area);
	int modifyArea(Area area);
	int deleteArea(int areaId);
}
