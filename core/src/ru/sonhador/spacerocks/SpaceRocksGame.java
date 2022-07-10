package ru.sonhador.spacerocks;

public class SpaceRocksGame extends BaseGame {

    @Override
    public void create() {
        super.create();
        setActiveScreen(new LevelScreen());
    }
}
