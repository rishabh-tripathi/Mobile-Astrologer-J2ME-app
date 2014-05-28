/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.killermobi.ma.rish;

import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.core.KuixConstants;
import org.kalmeo.kuix.widget.Screen;
import org.kalmeo.kuix.widget.Text;
import org.kalmeo.kuix.widget.TextArea;
import org.kalmeo.util.frame.Frame;

/**
 *
 * @author rishabh
 */
public class CentralFocusLPFrame implements Frame {

    public Screen screen;
    public String name, dob;
    public int lifepath, expression, soulurge, birthdate;
    public char fl;

    public CentralFocusLPFrame(String name, String dob, int lifepath, int expression, int soulurge, int birthdate, char fl) {
        this.name = name;
        this.dob = dob;
        this.lifepath = lifepath;
        this.expression = expression;
        this.soulurge = soulurge;
        this.birthdate = birthdate;
        this.fl = fl;
    }

    public void onAdded() {
        screen = Kuix.loadScreen("basic.xml", null);
        Text t1 = (Text) screen.getWidget("text1");
        t1.setText(name.toUpperCase());
        TextArea t2 = (TextArea) screen.getWidget("text2");
        t2.setText("Central Focus");
        lifePath ff = new lifePath();
        TextArea t3 = (TextArea) screen.getWidget("text3");
        t3.setText("The Central Focus of your life is the learning of,");
        TextArea ta1 = (TextArea) screen.getWidget("details1");
        ta1.setText(ff.getCentralFocus(lifepath));
        TextArea note = (TextArea) screen.getWidget("details3");
        note.setText("Note: [It is the major lesson to be learned in this life - the defined path which will provide the maximum in growth and development.]");
        screen.setCurrent();
    }

    public boolean onMessage(Object o, Object[] os) {
        if ("next".equals(o)) {
            Kuix.getFrameHandler().pushFrame(new CharacterLPFrame(name, dob, lifepath, expression, soulurge, birthdate, fl));
            return false;
        }
        if ("back".equals(o)) {
            Kuix.getFrameHandler().pushFrame(new FirstLatterFrame(name, dob, lifepath, expression, soulurge, birthdate, fl));
            return false;
        }
        if ("home".equals(o)) {
            Kuix.getFrameHandler().pushFrame(new HomeFrame());
            return false;
        }
        if ("exitConfirm".equals(o)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("Do you really want to Exit?"), KuixConstants.ALERT_YES | KuixConstants.ALERT_NO, "exit", null);
            return false;
        }
        if ("exit".equals(o)) {
            // get the midlet instance to invoke the Destroy() method
            Home.getDefault().destroyImpl();
            //if the event has been processed, we return 'false' to avoid event forwarding to other frames
            return false;
        }

        return false;
    }

    public void onRemoved() {
        // destroy the screen
        screen.cleanUp();
        // unreference the screen object to free the memory
        screen = null;
    }
}
