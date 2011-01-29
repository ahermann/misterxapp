package com.misterxapp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.google.inject.Singleton;
import com.misterxapp.model.Player;

@Singleton
public class PlayerServiceImpl implements PlayerService {

	private AtomicLong idGenerator = new AtomicLong(0);

	private Map<Long, Player> players = new HashMap<Long, Player>();
	
	@Override
	public List<Player> getAllPlayers() {
		return new ArrayList<Player>(players.values());
	}

	@Override
	public Player createPlayer() {
		Player player = new Player();
		player.setId(idGenerator.incrementAndGet());
		players.put(player.getId(), player);
		return player;
	}

	@Override
	public Player getPlayer(Long playerId) {
		return players.get(playerId);
	}

}
