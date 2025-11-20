package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.GenericShooter;

class shootCommand extends Command {

    private GenericShooter m_subsystem;
        
        @Override
        public boolean isFinished() {
            return false;
        }
    
        @Override
        public void initialize() {
            m_subsystem.speedUp();
        }
    
    
        @Override
        public void end(boolean interrupted){
            m_subsystem.stop();
        }
    
        shootCommand(GenericShooter shooter, XboxController xboxController) {
            addRequirements(shooter);
            this.m_subsystem = shooter;
        }

}