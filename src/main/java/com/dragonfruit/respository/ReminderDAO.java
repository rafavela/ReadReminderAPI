package com.dragonfruit.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dragonfruit.bean.ReminderBean;

@Repository
public interface ReminderDAO  extends CrudRepository<ReminderBean, Long>{
	public ReminderBean findByReminderId(Long reminderId);
}
