package com.misterxapp.resource;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.inject.Inject;
import com.misterxapp.model.Game;
import com.misterxapp.model.Player;
import com.misterxapp.service.GameService;
import com.misterxapp.service.PlayerService;

@Path("game")
public class GameResource {

	@Inject
	private GameService gameService;
	
	@Inject
	private PlayerService playerService;

	/**
	 * Returns all games in XML format
	 */
	@GET
	@Path("/")
	@Produces("application/xml")
	public List<Game> getAllGames() {
		return gameService.getAllGames();
	}
	
	@GET
	@Path("/{gameId}")
	@Produces("application/xml")
	public Game getGame(@PathParam(value = "gameId") Long gameId) {
		return gameService.getGame(gameId);
	}
	
	@POST
	@Path("/{gameName}")
	@Produces("application/xml")
	public Game createGame(@PathParam(value = "gameName") String gameName) {
		return gameService.createGame(gameName);
	}
	
	@PUT
	@Path("/{gameId}/{playerId}")
	@Produces("application/xml")
	public void joinGame(@PathParam(value = "gameId") Long gameId, @PathParam(value = "playerId") Long playerId) {
		Game game = gameService.getGame(gameId);
		Player p = playerService.getPlayer(playerId);
		game.addPlayer(p);
	}
	
	@DELETE
	@Path("/{gameId}/{playerId}")
	@Produces("application/xml")
	public void leaveGame(@PathParam(value = "gameId") Long gameId, @PathParam(value = "playerId") Long playerId) {
		Game game = gameService.getGame(gameId);
		Player p = playerService.getPlayer(playerId);
		game.addPlayer(p);
	}
}
