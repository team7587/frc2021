/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import static frc.robot.Constants.*;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Hanger extends SubsystemBase {
  /**
   * Creates a new Hanger.
   */
  private final TalonSRX talon = new TalonSRX(HANGER_TALON_ID);

  public void extend() {
    talon.set(ControlMode.PercentOutput, -HANGER_MAX_SPEED);
  }

  public void retract() {
    talon.set(ControlMode.PercentOutput, HANGER_MAX_SPEED);
  }

  public void stop() {
    talon.set(ControlMode.PercentOutput, 0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
