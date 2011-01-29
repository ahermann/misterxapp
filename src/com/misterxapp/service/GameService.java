package com.misterxapp.service;

import java.util.List;

import com.misterxapp.model.Game;

/**
 * Provides functionality for accessing games
 */
public interface GameService {

	/**
	 * Gets all games
	 * @return all games
	 */
	List<Game> getAllGames();

	/**
	 * Creates a new game
	 * @param string
	 */
	Game createGame(String name);

	/**
	 * Gets an existing game
	 * @param gameId identifier
	 * @return existing game
	 */
	Game getGame(Long gameId);
	
}
