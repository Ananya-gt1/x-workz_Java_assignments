package com.xworkz.runner;

import com.xworkz.external.ConnectUser;
import com.xworkz.internal.Connector;
import com.xworkz.internal.ConnectorImpl;

public class ConnectorRunner {
    public static void main(String[] args) {

        Connector connector=new ConnectorImpl();

        ConnectUser connectUser=new ConnectUser(connector);

        connectUser.excute();
    }
}
