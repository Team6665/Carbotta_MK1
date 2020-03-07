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

public class ColorSpinner extends SubsystemBase{
  Solenoid colorSpinner = null;
  
  Solenoid m_colorSpinner = new Solenoid(Constants.pcm1);

  public void Pneumatics(){
    m_colorSpinner.set(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
