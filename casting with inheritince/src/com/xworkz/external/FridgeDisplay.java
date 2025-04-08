package com.xworkz.external;

import com.xworkz.internal.Fridge;
import com.xworkz.internal.FridgeChild;

public class FridgeDisplay {
    public void display(Fridge fridge) {
        fridge.cool();
        fridge.freeze();
        fridge.defrost();
        fridge.storeFood();
        fridge.openDoor();
        
        if (fridge instanceof FridgeChild) {
            FridgeChild fridgeChild = (FridgeChild) fridge;
            fridgeChild.fridgeSpecialAction();
        }
    }
}
