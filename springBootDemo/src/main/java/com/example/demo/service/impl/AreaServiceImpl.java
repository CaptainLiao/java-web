package com.example.demo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AreaDao;
import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	private AreaDao areaDao;

	@Override
	public List<Area> getAreaList() {
		return areaDao.queryAreas();
	}

	@Override
	public Area getAreaById(int areaId) {
		return areaDao.queryAreaById(areaId);
	}
	
	@Transactional
	@Override
	public int addArea(Area area) {
		if (area.getAreaName() == null || "".equals(area.getAreaName())) {
			throw new RuntimeException("插入 area 失败：" + area.toString());	
		}
		
		area.setCreateTime(new Date());
		area.setLastEditTime(new Date());
		int effectedNum = areaDao.insertArea(area);
		
		if (effectedNum > 0) return 1;
		throw new RuntimeException("插入 area 失败：" + area.toString());
	}
	
	@Transactional
	@Override
	public int modifyArea(Area area) {
		Integer areaId = area.getAreaId();
		if (areaId == null || areaId < 0) {
			throw new RuntimeException("修改 area 失败：" + area.toString());	
		}
		
		area.setLastEditTime(new Date());
		int effectedNum = areaDao.insertArea(area);
		
		if (effectedNum > 0) return 1;
		throw new RuntimeException("修改 area 失败：" + area.toString());
	}

	@Transactional
	@Override
	public int deleteArea(int areaId) {
		if (areaId < 0) {
			throw new RuntimeException("删除 area 失败：areaId = " + areaId);	
		}
		
		int effectedNum = areaDao.deleteArea(areaId);
		
		if (effectedNum > 0) return 1;
		throw new RuntimeException("删除 area 失败：areaId = " + areaId);
	}

}


















