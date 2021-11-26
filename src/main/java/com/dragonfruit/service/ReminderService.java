package com.dragonfruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragonfruit.bean.ReminderBean;
import com.dragonfruit.respository.ReminderDAO;

@Service
public class ReminderService {

	@Autowired
	private ReminderDAO reminderDAO;
	
	public ReminderBean getReminderBean(Long reminderId) {
		return reminderDAO.findByReminderId(reminderId);
	}
}
