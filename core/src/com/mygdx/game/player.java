/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 *
 * @author Jacob
 */
public class player {
    private static final int GRAVITY = -10;
    private Vector3 position;
    private Vector3 velocity;// ?
    private Texture texture;
    
    public boolean hit;

    public player(int x, int y){
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0, 0, 0);
        texture = new Texture("characters.png");
        
        hit = false;
    }
    
    public void moveRight() {
        
    }
    
    public void moveLeft() {
        
    }
    
     public float getWidth(){
        return texture.getWidth();
    }

    public float getHeight(){
        return texture.getHeight();
    }

  

    
    
}
