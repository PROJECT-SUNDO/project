package org.sundo.map.controllers;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sundo.commons.ListData;
import org.sundo.list.controllers.ObservatorySearch;
import org.sundo.list.controllers.RequestObservatory;
import org.sundo.wamis.entities.Observatory;
import org.sundo.wamis.services.ObservatoryInfoService;


@Controller
@RequestMapping("/map")
@RequiredArgsConstructor
public class MapController {
	private final ObservatoryInfoService observatoryInfoService;
	
	@GetMapping
	public String map(@ModelAttribute RequestObservatory form,
					  @ModelAttribute ObservatorySearch search,
					  Model model) {
		commonProcess("map", model);

		ListData<Observatory> data = observatoryInfoService.getList(search);

		model.addAttribute("items", data.getItems());
		model.addAttribute("pagination", data.getPagination());
		return "front/map/map";
	}

	@GetMapping("/{info}")
	public String info(@PathVariable("info")String info, Model model){

		commonProcess("info", model);
		return "front/map/popup/" + info;
	}
	
	private void commonProcess(String mode, Model model) {
		mode = StringUtils.hasText(mode) ? mode : "map";
		String pageTitle = "지도";
		
		List<String> addCommonScript = new ArrayList<>();
		List<String> addScript = new ArrayList<>();
		List<String> addCommonCss = new ArrayList<>();
		List<String> addCss = new ArrayList<>();
		
		if(mode.equals("map")) {
			pageTitle = "지도";
			addScript.add("map/map");
			addScript.add("map/aside");
			addScript.add("map/draw");
			addScript.add("map/markers");
			addCss.add("map/map");
		} else if (mode.equals("info")) {
			pageTitle = null;
			addScript.add("map/cctv");
			addCss.add("map/cctv");
		}
		model.addAttribute("pageTitle", pageTitle);
		model.addAttribute("addScript", addScript);
		model.addAttribute("addCss", addCss);
	}
}
