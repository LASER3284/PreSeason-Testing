package frc.robot.dashboard.tabs;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Swerve;

public class TestTab{
    private static SendableChooser<Command> m_autoChooser = new SendableChooser<Command>();
    private Swerve swerve;
    private Arm arm;

    public TestTab(Swerve swerve, Arm arm) {
        this.swerve = swerve;
        this.arm = arm;
    }
}
