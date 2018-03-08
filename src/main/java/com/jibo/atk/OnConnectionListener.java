package com.jibo.atk;

public interface OnConnectionListener {
    /** Interface for connecting to a robot */

    /** We succesfully connect to the robot */
    public void onConnected();

    /** We've started sending commands to the robot */
    public void onSessionStarted(ROMCommander romCommander);

    /** We were unable to connect from the robot */
    public void onConnectionFailed(Throwable throwable);

    /** We disconnected from the robot */
    public void onDisconnected(int code);
}
