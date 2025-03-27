package com.xworkz.projector.internal;

public class Battery {
        private String type;
        private Voltage voltage;

    public Battery(String type, Voltage voltage) {
        this.type = type;
        this.voltage = voltage;
    }
    public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Voltage getVoltage() {
            return voltage;
        }

        public void setVoltage(Voltage voltage) {
            this.voltage = voltage;
        }

        public void showBattery() {
            System.out.println("Battery Type: " + type);
            if(voltage!=null) {
                voltage.showVoltage();
            }else System.out.println("The voltage is null");
        }
}
