package org.koushik.javabrains.messenger2.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import org.koushik.javabrains.messenger2.model.Message;


public class MessageService {
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello World!", "Koushik");
		Message m2 = new Message(1L, "Hello Jersey!", "Koushik");

		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);

		return list;
	}
}
