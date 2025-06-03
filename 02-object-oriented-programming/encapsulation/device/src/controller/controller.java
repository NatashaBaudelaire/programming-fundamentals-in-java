package controller;

import Device.Device;

public class Controller {
	    private Device device;

	    public Controller(Device device) {
	        this.device = device;
	    }

	    public void togglePower() {
	        device.togglePower();
	    }

	    public void increaseSpeed() {
	        device.increaseSpeed();
	    }

	    public void decreaseSpeed() {
	        device.decreaseSpeed();
	    }
	}
