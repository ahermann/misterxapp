package com.misterxapp.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.inject.Inject;
import com.misterxapp.model.Game;
import com.misterxapp.model.Player;
import com.misterxapp.service.GameService;
import com.misterxapp.service.PlayerService;

@Path("player")
public class PlayerResource {

	@Inject
	private PlayerService playerService;
	
	@Inject
	private GameService gameService;
	
	@GET
	@Path("/")
	@Produces("application/xml")
	public List<Player> getAllPlayers() {
		return playerService.getAllPlayers();
	}
	
	@GET
	@Path("/{playerId}")
	@Produces("application/xml")
	public List<Player> getPlayers(@PathParam(value = "gameId") Long gameId) {
		Game game = gameService.getGame(gameId);
		return game.getPlayers();
	}
	
	@POST
	@Path("/")
	@Produces("application/xml")
	public Player createPlayer() {
		return playerService.createPlayer();
	}
	
	
}
