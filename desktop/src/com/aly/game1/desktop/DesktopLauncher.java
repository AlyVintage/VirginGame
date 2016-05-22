package com.aly.game1.desktop;

import com.aly.game1.MyGdxGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = MyGdxGame.GameName;
		config.width = MyGdxGame.WIDTH;
		config.height = MyGdxGame.HEIGHT;
		config.resizable = false;
		new LwjglApplication(new MyGdxGame(), config);

	}
}
