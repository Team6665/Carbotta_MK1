/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;



/**
 * An example command that uses an example subsystem.
 */
public class ColorSensor extends CommandBase {
  private final I2C.Port i2cPort = IC.port.kOnboard;

  private final ColorSensorV3 m_colorSensor = new ColorSensorV3 (i2cPort);
  
  @Override
  public void robotPerioic() {
    Color detectedColor = m_colorSensor.getColor();
    double IR = m_colorSensor.getIR();

    SmartDashboard.putNumber("Red", detectedColor.red);
    SmartDashboard.putNumber("Green", detectedColor.green);
    SmartDashboard.putNumber("Blue", detectedColor.blue);
    SmartDashboard.putNumber("IR", IR);

    int proximity = m_colorSensor.getProximity();
    SmartDashboard.putNumber("Proximity", proximity);
  }
}
