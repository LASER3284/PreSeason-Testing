package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    // this is making a private arm object
    private Arm arm;


    // motor object creation
    //CANSparkFlex arm_motor = new CANSparkFlex(12, MotorType.kBrushless);
    
    // this is the constructor, this is necessary
    // the "Arm arm" within the parenthesis is a parameter
    public Arm() {
    }


    // sets speed of motor to 2
    public void rotate() {
        //arm_motor.set(2);
    }

    // sets speed of motor to 0!
    public void stop() {
        //arm_motor.set(0);
    }
}
