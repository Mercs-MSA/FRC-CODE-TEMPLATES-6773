package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DevicePorts;
public class GenericShooter extends SubsystemBase{
    TalonFX shooterMotor;
    GenericShooter(){
        this.shooterMotor = new TalonFX() 
    }
    
}
