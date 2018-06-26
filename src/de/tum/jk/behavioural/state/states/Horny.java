package de.tum.jk.behavioural.state.states;

import de.tum.jk.behavioural.state.robot.Robot;

public class Horny implements State {
	
	private Robot robot;
	
	public Horny(Robot robot) {
		this.robot = robot;
	}

	@Override
	public String punch() {
		// TODO Auto-generated method stub
		return "awwww yeah";
	}

	@Override
	public String hug() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insult() {
		// TODO Auto-generated method stub
		return null;
	}

}
