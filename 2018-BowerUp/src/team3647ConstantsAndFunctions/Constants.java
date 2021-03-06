package team3647ConstantsAndFunctions;

public class Constants 
{
	//Motor Pins
	public final static int leftMaster = 57;
	public final static int rightMaster = 54;
	public final static int rightSlave1 = 58;
	public final static int rightSlave2 = 59;
	public final static int leftSlave1 = 52;
	public final static int leftSlave2 = 53;
	
	//Encoder Pins
	public final static int leftEncoderPinSourceA = 0;
	public final static int leftEncoderPinSourceB = 1;
	public final static int rightEncoderPinSourceA = 4;
	public final static int rightEncoderPinSourceB = 5;
	
	//JoySticks
	public final static int mainControllerNumber = 0;
	
	//Turn Constant for the Drivetrain
	public static double adjustmentConstant(double lValue)
	{
		lValue = Math.abs(lValue);
		lValue /= 22.85714285713;
		lValue += .0222;
		return lValue;
	}
	
	//Pins for Auto
	public final static int leftAutoPin = 6;
	public final static int middleAutoPin = 7;
	public final static int rightAutoPin = 8;
	
	//Auto numbers
	public final static double initialStraightLLSWSC = 772;
	public final static double smallTurnForSwitchSWSC = 386 * Math.PI;
	public final static double bigTurnForSwitchSWSC = 772 * Math.PI;
	public final static double distanceSwitchLLSWSC = 386;
	public final static double smallTurnFromSwitchSWSC = 964 * Math.PI;
	public final static double bigTurnFromSwitchSWSC = 1735.2 * Math.PI;
	public final static double backUpToPickUpCubeSWSC = 3214;
	
	public final static double moveOnce = 600;
	
	public final static double testStright = 50 * 100;
	public final static double testBig = 10 * moveOnce;
	public final static double testSmall = 5.56 * moveOnce;
	
	public final static double length = 2800;
	
	
	public final static double MSRRSWfirstbigTurn = 1.665 * length;
	public final static double MSRRSWfirstsmallTurn = 0.47124 * length;
	
	public final static double MSRRSWsecondbigTurn = 1.3 * length;
	public final static double MSRRSWsecondsmallTurn = 0.3679* length;
	
	public final static double MSRRSWStraight = 1.973 * length;
	
	public final static double testBigUTurn = 4.44* length;
	public final static double testSmallUTurn = 1.48 * length;
	
	public final static double switchStraight = 2.8 * length;
	public final static double switchFirstBigTurn = 4.8 * length;
	public final static double switchFirstSmallTurn = 1.275 * length;
	
	public final static double scaleStraight = 8 * length;
	public final static double scaleFirstBigTurn = 2.08915911464 * length;
	public final static double scaleFirstSmallTurn = 0.8969247026 * length;
	
	public final static double middleRSwitchBigTurn = 1.6650441064 * length;
	public final static double middleRSwitchSmallTurn = 0.471238898038 * length;
	
	public static final double switchFirstCurveSmallSpeedConstant = 1.88235294118;
	public static final double scaleFirstCurveSmallSpeedConstant = 2.3292469352;
	public static final double middleRightCurveSmallSpeedConstant = 3.53333333333;
	
	public static final double stop = 0;
	public static final double pickUp = 2900;
	public static final double sWitch = 15000;
	public static final double scale = 43600;

}
