package frc.robot.subsystems

import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.SubsystemBase

/**
 * Using the object keyword creates a singleton,
 * which is a class with only 1(global) instance.
 *
 * To refer to this instance, simply use the object name.
 * (here, it is ExampleSingletonSubsystem).
 *
 * Because a subsystem only ever has one instance,
 * using an object instead of a class is an acceptable design pattern.
 */
object ExampleSingletonSubsystem: SubsystemBase() {
    fun exampleMethodCommand(): Command {
        // Inline construction of command goes here.
        // Subsystem::run implicitly requires `this` subsystem.
        return run {
            println("This will run repeatedly")
        }.withTimeout(1.0)
    }

    val exampleProperty: Double
        get() {
            return 2.0
        }

    override fun periodic() {}
}