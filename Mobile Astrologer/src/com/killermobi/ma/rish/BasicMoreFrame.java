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
public class BasicMoreFrame implements Frame {

    public Screen screen;
     public String name, dob;
    public int lifepath, expression, soulurge, birthdate;
    public char fl;
public int date,month,year,a,b,c;
     public BasicMoreFrame(String name, String dob, int lifepath, int expression, int soulurge, int birthdate, char fl) {
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


String[] dobs = new String[3];
        int yyy = 0, zzz = 0, xxx = 0;
        while (yyy != dob.length()) {
            if (dob.charAt(yyy) == '/') {
                dobs[xxx] = dob.substring(zzz, yyy);
                zzz = yyy + 1;
                xxx++;
            }
            yyy++;
        }
        date = Integer.parseInt(dobs[0]);
        month = Integer.parseInt(dobs[1]);
        year = Integer.parseInt(dobs[2]);
// gives sum of date

        if (date != 11 && date != 22) {
            a = date / 10;
            b = date % 10;
            c = a + b;
        } else {
            c = date;
        }
        if (c > 9 && c != 11 && c != 22) {
            int d = c / 10;
            int e = c % 10;
            c = d + e;
        }




        screen = Kuix.loadScreen("basic.xml", null);
        basics base = new basics();
        Text tf = (Text) screen.getWidget("text1");
        tf.setText(name.toUpperCase());
        TextArea tf1 = (TextArea) screen.getWidget("text2");
        tf1.setText("[" + base.getKeywords(c).toUpperCase() + "]");
        TextArea ta = (TextArea) screen.getWidget("details1");
        ta.setText(base.luckyNumber(c, month));
        // Set the application current screen
        screen.setCurrent();
    }

    public boolean onMessage(Object o, Object[] os) {
        if ("next".equals(o)) {
            Kuix.getFrameHandler().pushFrame(new FirstLatterFrame(name, dob, lifepath, expression, soulurge, birthdate, fl));
            return false;
        }

        if ("back".equals(o)) {
            Kuix.getFrameHandler().pushFrame(new BasicFrame(name, dob, lifepath, expression, soulurge, birthdate, fl));
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
