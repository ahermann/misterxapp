package com.misterxapp.application;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.misterxapp.resource.GameResource;
import com.misterxapp.resource.PlayerResource;
import com.misterxapp.service.GameService;
import com.misterxapp.service.GameServiceImpl;
import com.misterxapp.service.PlayerService;
import com.misterxapp.service.PlayerServiceImpl;

public class GuiceModule implements Module
{
   public void configure(final Binder binder)
   {
	  // resources
	  binder.bind(PlayerResource.class);
	  binder.bind(GameResource.class);
	  
	  // services
	  binder.bind(PlayerService.class).to(PlayerServiceImpl.class);
      binder.bind(GameService.class).to(GameServiceImpl.class);
   }
}