package com.dragonfruit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reminder")
public class ReminderBean {
	@Id
	@Column(name="reminder_id")	
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long reminderId;
	@Column(name="english_expression")
	private String englishExpression;
	@Column(name="english_meaning")	
	private String englishMeaning;
}
