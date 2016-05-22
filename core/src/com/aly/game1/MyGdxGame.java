package com.aly.game1;

import com.badlogic.gdx.Game;

import Screens.SplashScreen;

public class MyGdxGame extends Game {
//	SpriteBatch batch;
//	Texture img;
	public final static String GameName = "Virgin";
	public static int WIDTH = 800;
	public static int HEIGHT = 600;

	private boolean paused;

	@Override
	public void create () {
		this.setScreen(new SplashScreen(this));
	}


//
	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
}
