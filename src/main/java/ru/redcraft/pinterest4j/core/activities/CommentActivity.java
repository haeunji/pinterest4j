package ru.redcraft.pinterest4j.core.activities;

import ru.redcraft.pinterest4j.Activity;
import ru.redcraft.pinterest4j.Pin;

public class CommentActivity extends PinActivity implements Activity {

	private final String commentMessage;
	
	public CommentActivity(Pin pin, String commentMessage) {
		super(ActivityType.COMMENT, pin);
		this.commentMessage = commentMessage;
	}

	public String getCommentMessage() {
		return commentMessage;
	}
	
}