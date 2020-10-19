package ru.sl;
import com.badlogic.gdx.Game;
import screen.MenuScreen;

public class MyGdxGame extends Game {

	@Override
	public void create () {
		setScreen(new MenuScreen());
	}
}
