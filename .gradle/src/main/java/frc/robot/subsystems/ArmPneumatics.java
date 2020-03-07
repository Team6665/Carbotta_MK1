/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Solenoid;

public class ArmPneumatics extends SubsystemBase{
  Solenoid armDeployment = null;
  
  Solenoid m_armPneumatics = new Solenoid(Constants.pcm1);

  public void out(){
    m_armPneumatics.set(true);
  }

  public void in(){
    m_armPneumatics.set(false);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
