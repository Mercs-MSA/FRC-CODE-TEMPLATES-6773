package frc.robot.subsystems;

import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.*; 


public class GenericShooter extends SubsystemBase{
    private final TalonFX shooterMotor;
    
    public GenericShooter(){
        this.shooterMotor = new TalonFX(DevicePorts.shooterMotorPort);
        this.shooterMotor.getConfigurator().apply(ShooterConstants.shootConfig);
    }
    
    public void speedUp(){
        VelocityVoltage request = new VelocityVoltage(ShooterConstants.velocity)
                                        .withSlot(0);
        shooterMotor.setControl(request);
        
    } 

    public void stop(){
        VelocityVoltage stopRequest = new VelocityVoltage(0).withSlot(0);
        shooterMotor.setControl(stopRequest);
    }

    public double getVelocity(){
        return shooterMotor.getVelocity().getValueAsDouble();
    }

}
