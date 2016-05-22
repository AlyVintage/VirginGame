package Screens;

import com.aly.game1.MyGdxGame;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by aly on 22.05.2016.
 */
public class SplashScreen extends AbstractScreen {

    private Texture sprashImg;

    public SplashScreen(MyGdxGame game){
        super(game);
        init();
    }

    private void init() {
        /* TODO replace a sprash image */
        sprashImg = new Texture("badlogic.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        spriteBatch.begin();
        spriteBatch.draw(sprashImg,0,0);
        spriteBatch.end();

    }
}
