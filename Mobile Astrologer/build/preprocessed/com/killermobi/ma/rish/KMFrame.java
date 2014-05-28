/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.killermobi.ma.rish;

import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.core.KuixConstants;
import org.kalmeo.kuix.core.KuixMIDlet;
import org.kalmeo.kuix.widget.Screen;
import org.kalmeo.kuix.widget.TextField;
import org.kalmeo.util.frame.Frame;

/**
 *
 * @author rishabh
 */
public class KMFrame implements Frame {

    public Screen screen;
    public String name, dob;
    public int lifepath, expression, soulurge, birthdate;
    public char fl;

    public KMFrame(String name, String dob, int lifepath, int expression, int soulurge, int birthdate, char fl) {
        this.name = name;
        this.dob = dob;
        this.lifepath = lifepath;
        this.expression = expression;
        this.soulurge = soulurge;
        this.birthdate = birthdate;
        this.fl = fl;
    }
    public void onAdded() {
        // Load the content from the XML file with Kuix.loadScreen static method
        screen = Kuix.loadScreen("kmads.xml", null);

        // Set the application current screen
        screen.setCurrent();
    }

    public boolean onMessage(Object identifier, Object[] arguments) {

        if ("home".equals(identifier)) {
            Kuix.getFrameHandler().pushFrame(new HomeFrame());
        }

        if ("back".equals(identifier)) {
            Kuix.getFrameHandler().pushFrame(new CommentryLPFrame(name, dob, lifepath, expression, soulurge, birthdate, fl));
        }

        if ("about".equals(identifier)) {
        Kuix.alert(Kuix.getMessage("Mobile Astrologer, Free astrology based on numerology. It predict your nature, your inner dream and your life path. Developed by, Rishabh Tripathi(killermobi.com)"), KuixConstants.ALERT_OK);
        }
        // return "true" makes the FramHandler to forward the message to the next frame in the stack
        return true;
    }

    public void onRemoved() {
        // destroy the screen
        screen.cleanUp();
        // unreference the screen object to free the memory
        screen = null;
    }
}
