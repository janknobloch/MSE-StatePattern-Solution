package de.tum.jk.behavioural.state.states;

import de.tum.jk.behavioural.state.robot.Robot;

public class Happy implements State {
	
	private Robot robot;
	
	public Happy(Robot robot) {
		this.robot = robot;
	}

	@Override
	public String punch() {
		this.robot.setState(new Angry(robot));
		return "Ouch, that hurt! Damn you, human!";
	}

	@Override
	public String hug() {
		this.robot.setState(new Horny(robot));
		return "Thank you ;)";
	}

	@Override
	public String insult() {
		//TODO handle state changes
		return "That was mean :(";
	}

}
