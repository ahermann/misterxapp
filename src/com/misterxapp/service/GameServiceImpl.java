package com.misterxapp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.google.inject.Singleton;
import com.misterxapp.model.Game;

@Singleton
public class GameServiceImpl implements GameService {
	
	private AtomicLong idGenerator = new AtomicLong(0);

	private Map<Long,Game> games = new HashMap<Long,Game>();
	
	public GameServiceImpl() {
	}

	@Override
	public List<Game> getAllGames() {
		ArrayList<Game> result = new ArrayList<Game>();
		result.addAll(games.values());
		return result;
	}

	@Override
	public Game createGame(String name) {
		Game game = new Game();
		game.setName(name);
		game.setId(idGenerator.incrementAndGet());
		games.put(game.getId(), game);
		return game;
	}

	@Override
	public Game getGame(Long gameId) {
		return games.get(gameId);
	}
}
