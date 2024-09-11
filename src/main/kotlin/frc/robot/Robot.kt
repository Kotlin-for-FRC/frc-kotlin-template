// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot

import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.hal.FRCNetComm.tInstances;
import edu.wpi.first.hal.FRCNetComm.tResourceType;
import edu.wpi.first.hal.HAL
import edu.wpi.first.wpilibj2.command.CommandScheduler
import edu.wpi.first.wpilibj2.command.PrintCommand

class Robot : TimedRobot() {
    private val autonomousCommand = PrintCommand("Hello, autonomous!")

    init {
        HAL.report(tResourceType.kResourceType_Language, tInstances.kLanguage_Kotlin)
    }

    override fun robotPeriodic() {
        CommandScheduler.getInstance().run()
    }

    override fun autonomousInit() {
        autonomousCommand.schedule()
    }

    override fun teleopInit() {
        autonomousCommand.cancel()
    }

    override fun testInit() {
        CommandScheduler.getInstance().cancelAll()
    }
}
