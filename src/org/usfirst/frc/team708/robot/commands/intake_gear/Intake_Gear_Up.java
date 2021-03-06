package org.usfirst.frc.team708.robot.commands.intake_gear;

import org.usfirst.frc.team708.robot.Constants;
import org.usfirst.frc.team708.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;


public class Intake_Gear_Up extends Command {

public Intake_Gear_Up() {
		
		requires(Robot.pivot_gear);
	}

	protected void initialize() {

	}

	protected void execute() {

		Robot.pivot_gear.moveMotor(Constants.INTAKE_FORWARD);
	}


	protected boolean isFinished() {

		return(false);
	}

	protected void end() {
	
		Robot.pivot_gear.stop();
	
	}

	protected void interrupted() {

		end();
	}
	
}
	
