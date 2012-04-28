package ru.redcraft.pinterest4j.core;

import java.util.List;

import ru.redcraft.pinterest4j.Board;
import ru.redcraft.pinterest4j.BoardCategory;
import ru.redcraft.pinterest4j.Pin;
import ru.redcraft.pinterest4j.Pinterest;
import ru.redcraft.pinterest4j.User;
import ru.redcraft.pinterest4j.core.api.InternalAPIManager;
import ru.redcraft.pinterest4j.core.managers.ManagerBundle;
import ru.redcraft.pinterest4j.exceptions.PinterestAuthException;
import ru.redcraft.pinterest4j.exceptions.PinterestBoardExistException;

public class PinterestImpl implements Pinterest {

	private final ManagerBundle managerBundle;
	
	public PinterestImpl(String login, String password) throws PinterestAuthException {
		InternalAPIManager internalAPI = new InternalAPIManager(login, password);
		managerBundle = new ManagerBundle(internalAPI);
	}

	public Pin addPinToBoard(long boardID, NewPin newPin) {
		return managerBundle.getPinManager().addPinToBoard(boardID, newPin);
	}

	public List<Board> getBoardsForUser(User user) {
		return managerBundle.getBoardManager().getBoards(user);
	}

	public Board createBoard(NewBoard newBoard) throws PinterestBoardExistException {
		return managerBundle.getBoardManager().createBoard(newBoard);
	}

	public Board updateBoard(Board board, String title, String description,
			BoardCategory category) {
		return managerBundle.getBoardManager().updateBoard(board, title, description, category);
	}

	public void deleteBoard(Board board) {
		managerBundle.getBoardManager().deleteBoard(board);
	}
}
