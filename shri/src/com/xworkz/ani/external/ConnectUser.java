package com.xworkz.ani.external;

import com.xworkz.ani.internal.Connector;

public class ConnectUser {
   private Connector connector;
    public ConnectUser(Connector connector){
        this.connector=connector;
    }

    public void execute(){
        if (this.connector!= null){
            connector.run();
        }
        else System.out.println("method is null");
    }
}
