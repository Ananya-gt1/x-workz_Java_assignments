package com.xworkz.ani.external;

import com.xworkz.ani.internal.ICC;

public class BCCI {
    ICC icc;
    public BCCI(ICC icc){
        this.icc=icc;

    }

//    public void setIcc(ICC icc) {
//        this.icc = icc;
//    }

    public void execute(){
        System.out.println("running the ececute method of BCCI");
        if (icc!=null){
            icc.fairPlay();
        }
        else System.out.println("icc is null can not execute");
    }
}
