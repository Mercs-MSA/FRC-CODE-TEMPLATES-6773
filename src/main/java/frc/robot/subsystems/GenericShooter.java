package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.*; 


public class GenericShooter extends SubsystemBase{
    static TalonFX shooterMotor;
    
    GenericShooter(){
        shooterMotor = new TalonFX(DevicePorts.shooterMotorPort);
    }
    
    public void speedUp(){
        shooterMotor.setVoltage(ShooterConstants.voltage);
    } 

    public void stop(){
        shooterMotor.setVoltage(0);
    }
}
