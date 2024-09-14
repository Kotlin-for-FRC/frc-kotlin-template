// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems

import edu.wpi.first.wpilibj.DigitalInput
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax
import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.SubsystemBase

/** Creates a new ExampleSubsystem.  */
class ExampleSubsystem(
    exampleConstructorArg: Double,
    /**
     * An example of a property that is also a constructor argument.
     * The value of inputID depends on the value passed in
     * when the ExampleSubsystem is created.
     */
    private val digitalInputID: Int,
    private val motorID: Int,
): SubsystemBase() {
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
     * An example of a regular kotlin property
     * whose value cannot be changed.
     */
    private val digitalInput = DigitalInput(digitalInputID)
    private val motor = PWMSparkMax(motorID)

    /**
     * An example of a regular kotlin property
     * that can be modified.
     */
    private var exampleMutableProperty = 2.0

    /**
     * An example of a property with a custom getter.
     * Every time this property is accessed, its value will be re-computed to a new value.
     *
     * Properties like these can be used to query a boolean state of the subsystem (for example, a digital sensor).
     */
    val exampleCondition: Boolean get() = motor.isAlive

    /**
     * An example of a property with a custom getter and a custom setter.
     *
     * When this property is assigned a value, the code within the set(){ }
     * block will also run.
     *
     * Note that this variable does not store data,
     * and is essentially a proxy for 2 different methods.
     */
    var exampleGetSetProperty: Double
        get() = motor.get()
        set(value) {
            motor.set(value)
        }

    /**
     * An example of a getter/setter property with a backing field.
     *
     * A backing field acts like an invisible variable tied to the property itself,
     * which can be accessed in the get() and set() methods of that property.
     *
     * In order to use a backing field, an initial value must be given to the property
     * itself.
     *
     * To refer to a backing field, use the keyword "field".
     *
     * Properties with a backing field can exclude either the getter or the setter.
     */
    var exampleBackingFieldProperty = exampleConstructorArg
        get() {
            field++
            return field
        }
        set(value) {
            motor.stopMotor()
            field = value + 1
        }

    /**
     * An example subsystem property using a lazy initializer.
     * A lazy initializer will initialize the property the first
     * time it is accessed, rather than when the subsystem is created.
     */
    val lazyProperty: Int by lazy { digitalInput.channel }

    override fun periodic() {
        // This method will be called once per scheduler run
    }

    override fun simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}