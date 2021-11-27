package com.dragonfruit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dragonfruit.bean.ReminderBean;
import com.dragonfruit.service.ReminderService;
import com.dragonfruit.util.ReminderConstants;

@RestController
@RequestMapping(path="reminder/v1",produces="application/json")
public class ReminderController {

	@Autowired
	private ReminderService reminderService;
	
	@GetMapping("/expression")
	public ReminderBean doGet(@RequestParam Map<String,String> allParams) {
		Long reminderId=this.getReminderId(allParams);	

		return reminderService.getReminderBean(reminderId);
	}
	
	@GetMapping("/length")
	public Long getReminderCount() {
		return reminderService.getReminderLength();
	}
	
	private Long getReminderId(Map<String,String> allParams) {
		return StringUtils.hasText(allParams.get(ReminderConstants.ID))?
				Long.valueOf(allParams.get(ReminderConstants.ID)):0;
	}	
}
