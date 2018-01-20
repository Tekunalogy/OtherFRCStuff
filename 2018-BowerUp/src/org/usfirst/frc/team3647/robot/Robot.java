package org.usfirst.frc.team3647.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import team3647subsystems.Drivetrain;
import team3647subsystems.Encoders;
import team3647subsystems.Joysticks;

public class Robot extends IterativeRobot {

	Encoders enc;
	Joysticks joy;
	Autonomous auto;
	
	@Override
	public void robotInit() 
	{
		try
		{
			CrashChecker.logRobotInit();
			enc = new Encoders();
			joy = new Joysticks();
			auto = new Autonomous();
			Drivetrain.drivetrainInitialization();
		}
		catch(Throwable t)
		{
			CrashChecker.logThrowableCrash(t);
			throw t;
		}
	
	}
	
	@Override
	public void autonomousInit() 
	{
		try 
		{
			CrashChecker.logAutoInit();
			Encoders.resetEncoders();
			auto.currentState = 1;
		}
		catch(Throwable t)
		{
			CrashChecker.logThrowableCrash(t);
			throw t;
		}
		
	}

	@Override
	public void autonomousPeriodic() 
	{
		while(DriverStation.getInstance().isAutonomous() && !DriverStation.getInstance().isDisabled())
		{
			enc.setEncoderValues();
			auto.runAuto(enc.leftEncoderValue, enc.rightEncoderValue);
		}
		
	}

	@Override
	public void teleopPeriodic() 
	{
		try 
		{
			CrashChecker.logTeleopPeriodic();
			enc.setEncoderValues();
			joy.setMainContollerValues();
<<<<<<< HEAD
=======
//			if(joy.buttonA)
//			{
//				Drivetrain.setLeftMotorSpeed(1);
////				Drivetrain.setRightMotorSpeed(-1);
//			}
//			else if(joy.buttonB)
//			{
//				Drivetrain.setLeftMotorSpeed(-1);
////				Drivetrain.setRightMotorSpeed(1);
//			}
//			else
//			{
//				Drivetrain.setLeftMotorSpeed(0);
////				Drivetrain.setRightMotorSpeed(0);
//			}
>>>>>>> 1074e6ff94ce9b104fe62a2ce1f3a6b8213eb1a9
			//Drivetrain.arcadeDrive(enc.leftEncoderValue, enc.rightEncoderValue, joy.leftJoySticky, joy.rightJoyStickx);
			Drivetrain.testDrive(joy.leftJoySticky, joy.rightJoyStickx);
		}
		catch(Throwable t)
		{
			CrashChecker.logThrowableCrash(t);
			throw t;
		}
	}

	@Override
	public void testPeriodic() 
	{
		enc.setEncoderValues();
		enc.testEncoders();
		joy.setMainContollerValues();
		Drivetrain.testDrive(joy.leftJoySticky, joy.rightJoySticky);
	}

}

