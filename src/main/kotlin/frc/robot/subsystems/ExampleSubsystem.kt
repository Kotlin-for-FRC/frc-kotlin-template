// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems

import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.SubsystemBase

/** Creates a new ExampleSubsystem.  */
class ExampleSubsystem(private val exampleProperty: Double): SubsystemBase() {

    init {
        // This is run when the ExampleSubsystem instance is created.
    }

    /**
     * Example command factory method.
     *
     * @return a command
     */
    fun exampleMethodCommand(): Command =
        // Inline construction of command goes here.
        // Subsystem::runOnce implicitly requires `this` subsystem.
        runOnce {
            println("This is an example command.")
        }

    /**
     * An example property querying a boolean state of the subsystem (for example, a digital sensor).
     */
    val exampleCondition: Boolean
        get() = false /* get() = value will recompute the value every time exampleCondition is polled */

    /**
     * An example subsystem property using a lazy initializer.
     */
    val lazyProperty: Double by lazy { 2.0 } // by lazy will delay initialization until the property is first polled.

    override fun periodic() {
        // This method will be called once per scheduler run
    }

    override fun simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}