package com.multi.metahouse.point.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/point")
public class PointController {
	@RequestMapping("/mypoint")
	public String viewMyPointPage() {
		return "point/point";
	}
	
	@RequestMapping("/charge")
	public String viewPointChargePage() {
		return "point/charge";
	}
}
