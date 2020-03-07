/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
//import sun.launcher.resources.launcher;


public class Launcher extends SubsystemBase {
  WPI_VictorSPX launchermotor1 = new WPI_VictorSPX(Constants.launcherTop);
  WPI_VictorSPX launchermotor2 = new WPI_VictorSPX(Constants.launcherBottom);


  
  //motor launcherTop = new WPI_VictorSPX(Constants.launcherTop);
  //motor launcherBottom = new WPI_VictorSPX(Constants.launcherBottom);

  /**
   * Creates a new ExampleSubsystem
   */
  public void Launch() {
    launchermotor1 = new WPI_VictorSPX(Constants.launcherTop);
    launchermotor2 = new WPI_VictorSPX(Constants.launcherBottom);

  }
  public void set(double speed){
    launchermotor1.setX(-0.65);
    launchermotor2.setX(.65);
  }

  public void LaunchStop(){
    launchermotor1.set(0.0);
    launchermotor2.set(0.0);

  }  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
public void TakeJoystickInput(Joystick joystick) {
}
}
