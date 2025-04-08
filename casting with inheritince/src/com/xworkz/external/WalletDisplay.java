package com.xworkz.external;

import com.xworkz.internal.Wallet;
import com.xworkz.internal.WalletChild;

public class WalletDisplay {
    public void display(Wallet wallet) {
        wallet.storeCash();
        wallet.storeCards();
        wallet.open();
        wallet.close();
        wallet.organize();
        
        if (wallet instanceof WalletChild) {
            WalletChild walletChild = (WalletChild) wallet;
            walletChild.walletSpecialAction();
        }
    }
}
