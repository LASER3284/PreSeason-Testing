package frc.robot.dashboard;

import java.util.ArrayList;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.Swerve;
import frc.robot.dashboard.tabs.TestTab;
import frc.robot.subsystems.Arm;

public class TabManager extends SubsystemBase {
    private static final ArrayList<TabBase> m_tabs = new ArrayList<TabBase>();

    private Swerve swerve;
    private Arm arm;

    public TabManager(Swerve swerve, Arm arm) {
        this.swerve = swerve;
        this.arm = arm;
    }

    public void addTabs() {
        m_tabs.add(new TestTab(swerve, arm));

        for (TabBase tab : m_tabs) {
            tab.createEntries();
        }
    }
    
    public void periodic() {
        for (TabBase tab : m_tabs) {
            tab.periodic();
        }
    }
}
