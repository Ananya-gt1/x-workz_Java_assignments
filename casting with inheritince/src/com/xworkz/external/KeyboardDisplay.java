package com.xworkz.external;

import com.xworkz.internal.Keyboard;
import com.xworkz.internal.KeyboardChild;

public class KeyboardDisplay {
    public void display(Keyboard keyboard) {
        keyboard.type();
        keyboard.connect();
        keyboard.pressKey();
        keyboard.clean();
        keyboard.lightUp();
        
        if (keyboard instanceof KeyboardChild) {
            KeyboardChild keyboardChild = (KeyboardChild) keyboard;
            keyboardChild.keyboardSpecialAction();
        }
    }
}
