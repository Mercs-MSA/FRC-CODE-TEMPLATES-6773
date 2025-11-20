package frc.robot.subsystems;

import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.*; 


public class GenericShooter extends SubsystemBase{
    private final TalonFX shooterMotor;
    VelocityVoltage velocityControl = new VelocityVoltage(0).withSlot(0);
    
    public GenericShooter(){
        this.shooterMotor = new TalonFX(DevicePorts.shooterMotorPort);
        this.shooterMotor.getConfigurator().apply(ShooterConstants.shootConfig);
    }
    
    public void speedUp(){
        shooterMotor.setControl(velocityControl.withVelocity(ShooterConstants.velocity));
    } 

    public void stop(){
        shooterMotor.setControl(velocityControl.withVelocity(0));
    }

}
