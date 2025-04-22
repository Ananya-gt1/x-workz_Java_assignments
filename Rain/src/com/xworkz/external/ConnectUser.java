package com.xworkz.external;

import com.xworkz.internal.Connector;

public class ConnectUser {
    Connector connector;

    public ConnectUser(Connector connector){
        this.connector=connector;
    }
    public void excute() {
        if (this.connector != null) {
            this.connector.run();
        } else {
            System.out.println("The Null");
        }
    }
}
