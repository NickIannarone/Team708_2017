package org.usfirst.frc.team708.robot.commands.intake_ball;

import org.usfirst.frc.team708.robot.Constants;
import org.usfirst.frc.team708.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Intake_Ball_In extends Command {

	public Intake_Ball_In() {
		
		requires(Robot.intake_ball);
	}

	protected void initialize() {

	}

	protected void execute() {

		Robot.intake_ball.moveMotor(Constants.INTAKE_FORWARD);
	}


	protected boolean isFinished() {

		return(false);
	}

	protected void end() {
	
		Robot.intake_ball.stop();
	
	}

	protected void interrupted() {

		end();
	}
	
}
	