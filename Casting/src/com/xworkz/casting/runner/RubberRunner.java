package com.xworkz.casting.runner;

import com.xworkz.casting.internal.Armyvehicle;
import com.xworkz.casting.internal.MRFTyre;
import com.xworkz.casting.internal.Rubber;
import com.xworkz.casting.internal.Tyre;

public class RubberRunner {
    public static void main(String[] args) {

        Rubber rubber=new Rubber();
        rubber.expand();

        Tyre tyre=new Tyre();
        tyre.expand();
        tyre.compress();

        Rubber rubber1=new Tyre();
        rubber1.expand();

        MRFTyre mrfTyre=new MRFTyre();
        mrfTyre.expand();
        mrfTyre.radial();

        Armyvehicle armyvehicle=new Armyvehicle();
        armyvehicle.wheel(rubber);
        armyvehicle.wheel(tyre);;
        armyvehicle.wheel(rubber1);
        armyvehicle.wheel(mrfTyre);
    }

}
