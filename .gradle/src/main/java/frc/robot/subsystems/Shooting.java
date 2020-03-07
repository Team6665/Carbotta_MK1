/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.Talon;


public class Shooting extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  public Shooting() {
    
    Talon launcherTopMotor = new Talon(Constants.launcherTop);
    Talon launcherBottomMotor = new Talon(Constants.launcherBottom);

    launcherTopMotor.setInverted(true);
    
 
    //  PUT BUTTONS HERE


  }

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
