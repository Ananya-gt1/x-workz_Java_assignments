package com.xworkz.external;

import com.xworkz.internal.Scissors;
import com.xworkz.internal.ScissorsChild;

public class ScissorsDisplay {
    public void display(Scissors scissors) {
        scissors.cut();
        scissors.trim();
        scissors.sharpen();
        scissors.clean();
        scissors.store();
        
        if (scissors instanceof ScissorsChild) {
            ScissorsChild scissorsChild = (ScissorsChild) scissors;
            scissorsChild.scissorsSpecialAction();
        }
    }
}
