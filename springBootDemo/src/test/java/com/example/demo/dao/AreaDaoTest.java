package com.example.demo.dao;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.intThat;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Area;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
	@Autowired
	private AreaDao areaDao;
	
	@Test
	@Ignore
	public void queryAreas() {
		List<Area> areas = areaDao.queryAreas();
		assertEquals(4, areas.size());
	}
	@Test
	@Ignore
	public void queryAreaById() {
		Area area = areaDao.queryAreaById(4);
		assertEquals("东苑", area.getAreaName());
	}
	@Test
	public void insertArea() {
		Area area = new Area();
		area.setAreaName("中苑");
		area.setPriority(6);
		int effectedNum = areaDao.insertArea(area);
		assertEquals(1, effectedNum);
	}
	@Test
	@Ignore
	public void updateArea() {
		Area area = areaDao.queryAreaById(8);
		area.setAreaName("中中苑");
		area.setLastEditTime(new Date());
		int effectedNum = areaDao.updateArea(area);
		assertEquals(1, effectedNum);
	}
	@Test
	@Ignore
	public void deleteArea() {
		int effectedNum = areaDao.deleteArea(8);
		assertEquals(1, effectedNum);
	}
}
