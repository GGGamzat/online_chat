package com.example.online_chat.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import com.example.online_chat.entity.MessageStatus;

@Entity
public class ChatMessage {
	@Id
	private Long id;
	private Integer chatId;
	private Integer senderId;
	private Integer recipientId;
	private String senderName;
	private String recipientName;
	private String content;
	private Date timestamp;
	private MessageStatus status;
}