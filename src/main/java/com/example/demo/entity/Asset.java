package com.example.demo.entity;

import javax.persistence.Id;

import lombok.Data;

/*
	资产的实体，对应asset表
*/
@Data
public class Asset {
	@Id
	private int id; // 对应asset表的id字段
	private String name; // 对应asset表的name字段
	private String num; // 对应asset表的num字段
	private String rfid; // 对应asset表的rfid字段
	private int state; // 对应asset表的state字段
	
}
