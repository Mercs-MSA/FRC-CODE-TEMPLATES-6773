package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.ShooterConstants;
import frc.robot.subsystems.GenericShooter;

class shootCommand extends Command {

    private GenericShooter m_subsystem;
    long time = System.currentTimeMillis();
    
    @Override
    public boolean isFinished() {
        return time + ShooterConstants.shootTime <= System.currentTimeMillis();
    }

    @Override
    public void initialize() {
        m_subsystem.speedUp();
        time = System.currentTimeMillis();
    }


    @Override
    public void end(boolean interrupted){
        m_subsystem.stop();
    }

    shootCommand(GenericShooter shooter) {
        addRequirements(shooter);
        this.m_subsystem = shooter;
    }

}