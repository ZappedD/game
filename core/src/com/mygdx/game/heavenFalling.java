package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.states.*;
public class heavenFalling extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
        player pl;
        
            private GameStateManager gameStateManager;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
                pl = new player(0, 0);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
                
                batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
                
		img.dispose();
	}
}
