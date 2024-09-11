package frc.robot.commands

import edu.wpi.first.wpilibj2.command.Commands
import frc.robot.subsystems.ExampleSubsystem

fun exampleAuto(exampleSubsystem: ExampleSubsystem) =
    Commands.sequence(
        exampleSubsystem.exampleMethodCommand(),
        ExampleCommand(exampleSubsystem)
    )