package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.ShooterConstants;
import frc.robot.subsystems.GenericShooter;

class shootCommand extends Command {

    private GenericShooter m_subsystem;
    long time = System.currentTimeMillis();
        private XboxController controller;
        
        @Override
        public boolean isFinished() {
            return false;
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
    
        shootCommand(GenericShooter shooter, XboxController xboxController) {
            addRequirements(shooter);
            this.m_subsystem = shooter;
            this.controller = xboxController;
    }

}