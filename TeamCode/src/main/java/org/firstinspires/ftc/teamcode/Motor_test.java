package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name="Prime")
public class Motor_test extends OpMode{

    DcMotor mt_rf;
    DcMotor mt_rb;
    DcMotor mt_lf;
    DcMotor mt_lb;
    DcMotor mt_ud;

    @Override
    public void init() {
            mt_lb = hardwareMap.get(DcMotor.class, "left_back");
            mt_rf = hardwareMap.get(DcMotor.class, "right_front");
            mt_rb = hardwareMap.get(DcMotor.class, "right_back");
            mt_lf = hardwareMap.get(DcMotor.class, "left_front");
            mt_ud = hardwareMap.get(DcMotor.class, "up_down");
        }

        @Override
        public void loop () {

            // Forward and Backward - good
            mt_lb.setPower(gamepad1.left_stick_y);
            mt_rf.setPower(gamepad1.left_stick_y * -1);
            mt_rb.setPower(gamepad1.left_stick_y * -1);
            mt_lf.setPower(gamepad1.left_stick_y);

            // Left and Right - good
            mt_lb.setPower(gamepad1.right_stick_x);
            mt_rf.setPower(gamepad1.right_stick_x * -1);
            mt_rb.setPower(gamepad1.right_stick_x);
            mt_lf.setPower(gamepad1.right_stick_x * -1);

            // Diagonal Right Forward - good
            mt_rb.setPower(gamepad1.right_trigger);
            mt_lf.setPower(gamepad1.right_trigger * -1);

            // Diagonal Left Back - good
            if (gamepad1.left_bumper) {
                mt_rb.setPower(-1);
            }
            if (gamepad1.left_bumper) {
                mt_lf.setPower(1);
            }

            // Diagonal Right Back
            if (gamepad1.right_bumper) {
                mt_lb.setPower(1);
            }
            if (gamepad1.right_bumper) {
                mt_rf.setPower(-1);
            }

            // Diagonal Left Forward
            mt_lb.setPower(gamepad1.left_trigger * -1);
            mt_rf.setPower(gamepad1.left_trigger);

            //Spin+
            if (gamepad1.dpad_right) {
                mt_lb.setPower(-1);
            }
            if (gamepad1.dpad_right) {
                mt_lf.setPower(-1);
            }
            if (gamepad1.dpad_right) {
                mt_rb.setPower(-1);
            }
            if (gamepad1.dpad_right) {
                mt_rf.setPower(-1);
            }

            //Spin-
            if (gamepad1.dpad_left) {
                mt_lb.setPower(1);
            }
            if (gamepad1.dpad_left) {
                mt_lf.setPower(1);
            }
            if (gamepad1.dpad_left) {
                mt_rb.setPower(1);
            }
            if (gamepad1.dpad_left) {
                mt_rf.setPower(1);
            }

            //test
            if (gamepad1.a) {
                mt_lb.setPower(1);
            }
            if (gamepad1.b) {
                mt_rb.setPower(1);
            }
            if (gamepad1.x) {
                mt_rf.setPower(1);
            }
            if (gamepad1.y) {
                mt_lf.setPower(1);
            }
            //slide
            mt_ud.setPower(gamepad2.left_stick_y);
        }
    }
