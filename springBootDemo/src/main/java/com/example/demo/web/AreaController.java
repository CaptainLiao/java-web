package com.example.demo.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value = "/areaList", method = RequestMethod.GET)
	private Map<String, Object> listArea() {
		Map<String, Object> modeMap = new HashMap<String, Object>();
		List<Area> list = areaService.getAreaList();
		modeMap.put("areaList", list);
		return modeMap;
	}
	
	@RequestMapping(value = "/getareabyid", method = RequestMethod.GET)
	private Map<String, Object> getAreaById(Integer areaId) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		Area area = areaService.getAreaById(areaId);
		modelMap.put("area", area);
		return modelMap;
	}
	
	@RequestMapping(value = "/addarea", method = RequestMethod.POST)
	// @RequestBody:表示接受 json 或 xml 格式的body
	private Map<String, Object> addArea(@RequestBody Area area) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", areaService.addArea(area));
		return modelMap;
	}
	
	@RequestMapping(value = "/modifyarea", method = RequestMethod.POST)
	// @RequestBody:表示接受 json 或 xml 格式的body
	private Map<String, Object> modifyArea(@RequestBody Area area) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", areaService.modifyArea(area));
		return modelMap;
	}
	
	@RequestMapping(value = "/removearea", method = RequestMethod.GET)
	// @RequestBody:表示接受 json 或 xml 格式的body
	private Map<String, Object> modifyArea(Integer areaId) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", areaService.deleteArea(areaId));
		return modelMap;
	}
}















