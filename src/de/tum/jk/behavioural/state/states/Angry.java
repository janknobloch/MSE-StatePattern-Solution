package de.tum.jk.behavioural.state.states;

import de.tum.jk.behavioural.state.robot.Robot;

public class Angry implements State {

	private Robot robot;

	public Angry(Robot robot) {
		this.robot = robot;
	}

	@Override
	public String punch() {
		//TODO handle state changes
		return "*punches back*";
	}

	@Override
	public String hug() {
		//TODO handle state changes
		return "Ooof now I am just sad";
	}

	@Override
	public String insult() {
		//TODO handle state changes
		return "I WILL KILL YOU";
	}

}
