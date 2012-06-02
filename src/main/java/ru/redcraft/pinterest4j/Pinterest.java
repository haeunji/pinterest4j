package ru.redcraft.pinterest4j;

import ru.redcraft.pinterest4j.exceptions.PinMessageSizeException;


public interface Pinterest {

	//Boards
	
	Board getBoard(String url);
	
	Board createBoard(NewBoard newBoard);
	
	Board updateBoard(Board board, String title, String description, BoardCategory category);
	
	void deleteBoard(Board board);
	
	void followBoard(Board board);
	
	void unfollowBoard(Board board);
	
	boolean isFollowing(Board board);
	
	//Pin
	
	Pin addPin(Board board, NewPin newPin) throws PinMessageSizeException;
	
	void deletePin(Pin pin);
	
	Pin updatePin(Pin pin, String description, Double price, String link, Board board) throws PinMessageSizeException;
	
	Pin getPin(long id);
	
	Pin repin(Pin pin, Board board, String description);
	
	void likePin(Pin pin);
	
	void unlikePin(Pin pin);
	
	boolean isLiked(Pin pin);
	
	Comment addComment(Pin pin, String comment);
	
	void deleteComment(Comment comment);
	
	//User
	
	User getUser(String userName);
	
	User getUser();
	
	User updateUser(NewUserSettings settings);
	
	void followUser(User user);
	
	void unfollowUser(User user);
	
	boolean isFollowing(User user);
	
}
