package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class ArmMove extends Command {
    // creates arm object
    Arm arm = new Arm();

    public ArmMove() {
    }

    public void initialize() {
        
    }

    // what the command runs
    public void execute() {
        arm.rotate();
    }


    // end of the command, stops the robot
    public void end() {
        arm.stop();
    }
}
