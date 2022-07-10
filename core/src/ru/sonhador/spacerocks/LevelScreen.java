/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.sonhador.spacerocks;

import com.badlogic.gdx.Input.Keys;

/**
 *
 * @author sonhador
 */
public class LevelScreen extends BaseScreen {
    private SpaceShip spaceship;

    @Override
    public void initialize() {
        BaseActor space = new BaseActor(0, 0, mainStage);
        space.loadTexture("space.png");
        space.setSize(800,600);
        BaseActor.setWorldBounds(space);
        
        spaceship = new SpaceShip(400, 300, mainStage);
    }

    @Override
    public void update(float dt) {
    }

    @Override
    public boolean keyDown(int i) {
        if(i == Keys.X)
            spaceship.warp();
        
        if(i == Keys.SPACE)
            spaceship.shoot();
        
        return false;
    }
}
