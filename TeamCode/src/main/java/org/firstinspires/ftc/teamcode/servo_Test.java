package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "ServoTest")
//@Disabled
public class servo_Test extends LinearOpMode {

    public Servo servo;
    ElapsedTime timer;

    @Override
    public void runOpMode() {

    servo = hardwareMap.servo.get("OC");
    timer = new ElapsedTime();
    waitForStart();
    timer.reset();

    while (opModeIsActive()){

        if(gamepad2.right_bumper){
            timer.reset();
            while(timer.seconds()<0.095){
                servo.setPosition(1);
            }
        }
        else if(gamepad2.left_bumper) {
            timer.reset();
            while(timer.seconds()<=0.095){
                servo.setPosition(0);
            }
        }
        else{
                servo.setPosition(0.5);
        }

        }

        }
    }

    /*static final double INCREMENT   = 0.01;     // amount to slew servo each CYCLE_MS cycle
    static final int    CYCLE_MS    =   50;     // period of each cycle
    static final double MAX_POS     =  1.0;     // Maximum rotational position
    static final double MIN_POS     =  0.0;     // Minimum rotational position

    // Define class members
    Servo AU;
    double  position = (MAX_POS - MIN_POS) / 2; // Start at halfway position
    boolean open = false;
    boolean close = false;



    @Override
    public void runOpMode() {

        // Connect to servo (Assume Robot Left Hand)
        // Change the text in quotes to match any servo name on your robot.
        AU = hardwareMap.get(Servo.class, "AU");

        // Wait for the start button
        telemetry.addData(">", "Press Start to scan Servo." );
        telemetry.update();
        waitForStart();

        // Scan servo till stop pressed.
        while(opModeIsActive()){
            if (gamepad2.left_bumper && position > MIN_POS) {
                open = true;
                close = false;
            }

            if (gamepad2.right_bumper && position < MAX_POS){
                open = false;
                close = true;
            }


            // slow the servo, according to the rampUp (direction) variable.
            if (open) {
                // Keep stepping up until we hit the max value.
                position += INCREMENT;
                if (position <= MAX_POS ) {
                    position = MAX_POS;
                    open = false;
                }
            }
            if (close){
                // Keep stepping down until we hit the min value.
                position -= INCREMENT;
                if (position >= MIN_POS ) {
                    position = MIN_POS;
                    close = true;
                }
            }

            // Display the current value
            telemetry.addData("Servo Position", "%5.2f", position);
            telemetry.addData(">", "Press Stop to end test." );
            telemetry.update();

            // Set the servo to the new position and pause;
            AU.setPosition(position);
            sleep(CYCLE_MS);
            idle();
        }

        // Signal done;
        telemetry.addData(">", "Done");
        telemetry.update();


    }
     */

/*servo = hardwareMap.servo.get("OC");
    waitForStart();

    while (opModeIsActive())
        if (gamepad2.right_bumper) {
            servo.setPosition(1);
        }
        else if (gamepad2.left_bumper) {
                servo.setPosition(0);
            }
        else
        {
            servo.setPosition(0.5);
        }*/
