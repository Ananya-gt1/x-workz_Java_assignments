package com.xworkz.external;

import com.xworkz.internal.Speaker;
import com.xworkz.internal.SpeakerChild;

public class SpeakerDisplay {
    public void display(Speaker speaker) {
        speaker.playMusic();
        speaker.pause();
        speaker.increaseVolume();
        speaker.decreaseVolume();
        speaker.connectBluetooth();
        
        if (speaker instanceof SpeakerChild) {
            SpeakerChild speakerChild = (SpeakerChild) speaker;
            speakerChild.speakerSpecialAction();
        }
    }
}
