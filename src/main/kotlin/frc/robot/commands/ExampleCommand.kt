package frc.robot.commands

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.subsystems.ExampleSubsystem


/**
 * An example command that uses an example subsystem.
 *
 * Subclassed commands should never use the singleton pattern.
 *
 * @param subsystem The subsystem used by this command.
 */
class ExampleCommand(private val subsystem: ExampleSubsystem): Command() {
    init {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem)
    }

    // Called when the command is initially scheduled.
    override fun initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    override fun execute() {}

    // Called once the command ends or is interrupted.
    override fun end(interrupted: Boolean) {}

    // Returns true when the command should end.
    override fun isFinished(): Boolean {
        return false
    }
}
