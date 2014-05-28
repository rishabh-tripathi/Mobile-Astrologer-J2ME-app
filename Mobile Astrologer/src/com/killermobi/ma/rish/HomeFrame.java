/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.killermobi.ma.rish;

import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.core.KuixConstants;
import org.kalmeo.kuix.widget.Choice;
import org.kalmeo.kuix.widget.RadioButton;
import org.kalmeo.kuix.widget.RadioGroup;
import org.kalmeo.kuix.widget.Screen;
import org.kalmeo.kuix.widget.TextField;
import org.kalmeo.util.frame.Frame;

/**
 *
 * @author rishabh
 */
public class HomeFrame implements Frame {

    public Screen screen;
     public String name, dob;
    public int date = 0;
    public int month = 0;
    public int year = 0;
    public int lifepath, expression, soulurge, birthdate;
    public int a, b, c;
    public char fl;
    int p,q,r,s;

    public void onAdded() {
        // Load the content from the XML file with Kuix.loadScreen static method
        screen = Kuix.loadScreen("home.xml", null);

        // Set the application current screen
        screen.setCurrent();
    }

    public boolean onMessage(Object identifier, Object[] arguments) {

        if ("go".equals(identifier)) {
            TextField textField = (TextField) screen.getWidget("name");
            TextField dateip = (TextField) screen.getWidget("date");
            Choice monthip = (Choice)screen.getWidget("month");
            RadioGroup rr = monthip.getRadioGroup();
            RadioButton rb = rr.getSelectedRadioButton();            
            TextField yearip = (TextField) screen.getWidget("year");
            
     if(textField.getText()!=null && !(textField.getText().equals("Your Birth Name")) && textField.getText().length()>3 && dateip.getText()!=null && yearip.getText()!=null)
     {
           String name, dob;
           name = textField.getText();            
            dob = dateip.getText()+"/"+rb.getId().toString()+"/"+yearip.getText();
        System.out.print(dob);
        boolean found = false;
        int counter = 0;
        while (found == false) {
            if (name.charAt(counter) != ' ') {
                fl = name.charAt(counter);
                found = true;
            } else {
                counter++;
            }
        }

try{
        String[] dobs = new String[3];
        dob = dob + "/";
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
        birthdate = date;
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
// sum of month
        int j = getValueOfMonth(month);

// sum of year
        p = 1000;
        q = 0; r = 0;
        s = year;

        for (int i = 1; i <= 4; i++) {
            q = s / p;
            s = s % p;
            r = r + q;
            p = p / 10;
        }

        while (r > 9 && r != 11 && r != 22) {
            p = r / 10;
            s = r % 10;
            r = p + s;
        }

        lifepath = c + j + r;
        while (lifepath > 9 && lifepath != 11 && lifepath != 22) {
            p = lifepath / 10;
            s = lifepath % 10;
            lifepath = p + s;
        }

// calculation for essancials

        name = name + "  ";
        int yy = 0, zz = 0;
        int ess = 0;
        while (yy != name.length()) {
            if (name.charAt(yy) == ' ') {
                ess = ess + sumOfName(name.substring(zz, yy));
                zz = yy + 1;
            }
            yy++;
        }

        while (ess > 9 && ess < 100 && ess != 11 && ess != 22) {
            p = ess / 10;
            s = ess % 10;
            ess = p + s;
        }
        expression = ess;

// calculation for soul urge
        int i = 0, soulUrge = 0, soulUrgeSum = 0;
        yy = 0;
        zz = 0;
        String ss;
        while (yy != name.length()) {
            if (name.charAt(yy) == ' ') {
                ss = name.substring(zz, yy);
                soulUrge = 0;
                i = 0;
                while (i != ss.length()) {
                    if (ss.charAt(i) == 'a' || ss.charAt(i) == 'A' || ss.charAt(i) == 'e' || ss.charAt(i) == 'E' || ss.charAt(i) == 'i' || ss.charAt(i) == 'I' || ss.charAt(i) == 'o' || ss.charAt(i) == 'O' || ss.charAt(i) == 'u' || ss.charAt(i) == 'U') {
                        soulUrge = soulUrge + getCharValue(ss.charAt(i));
                    } else if (ss.charAt(i) == 'y' || ss.charAt(i) == 'Y' || ss.charAt(i) == 'w' || ss.charAt(i) == 'W') {
                        if (i != 0) {
                            if (ss.charAt(i - 1) == 'a' || ss.charAt(i - 1) == 'A' || ss.charAt(i - 1) == 'e' || ss.charAt(i - 1) == 'E' || ss.charAt(i - 1) == 'i' || ss.charAt(i - 1) == 'I' || ss.charAt(i - 1) == 'o' || ss.charAt(i - 1) == 'O' || ss.charAt(i - 1) == 'u' || ss.charAt(i - 1) == 'U') {
                                soulUrge = soulUrge + getCharValue(ss.charAt(i));
                            }
                        }
                    } else {
                    }
                    i++;
                }

                if (soulUrge == 0) {
                    i = 0;
                    while (i != ss.length()) {
                        if (ss.charAt(i) == 'y' || ss.charAt(i) == 'Y' || ss.charAt(i) == 'w' || ss.charAt(i) == 'W') {
                            soulUrge = soulUrge + getCharValue(ss.charAt(i));
                        }
                        i++;
                    }
                }
                while (soulUrge > 9 && soulUrge < 100 && soulUrge != 11 && soulUrge != 22) {
                    p = soulUrge / 10;
                    q = soulUrge % 10;
                    soulUrge = p + q;
                }
                soulUrgeSum = soulUrgeSum + soulUrge;
                System.out.println(ss + soulUrge);
                zz = yy + 1;
            }
            yy++;
        }

        soulUrge = soulUrgeSum;
        while (soulUrge > 9 && soulUrge < 100 && soulUrge != 11 && soulUrge != 22) {
            p = soulUrge / 10;
            q = soulUrge % 10;
            soulUrge = p + q;
        }

        soulurge = soulUrge;
}catch(Exception e)
{
    Kuix.alert(Kuix.getMessage("Date of Birth format is wrong!! Enter your date of birth in dd/mm/yyyy format. Eg 12/08/1987"), KuixConstants.ALERT_OK);
    Kuix.getFrameHandler().pushFrame(new HomeFrame());
}

           if(name!=null && !(name.equals("Your Birth Name")) && dob!=null && name.length()>3)
            {
            Kuix.getFrameHandler().pushFrame(new BasicFrame(name, dob, lifepath, expression, soulurge, birthdate, fl));
            }
            else
            {
                Kuix.alert(Kuix.getMessage("Name and/or Date of birth format is wrong. Enter your Name and Date of Birth as per mention format."), KuixConstants.ALERT_OK);
            }
     }
      else
            {
                Kuix.alert(Kuix.getMessage("Name and/or Date of birth format is wrong. Enter your Name and Date of Birth as per mention format."), KuixConstants.ALERT_OK);
            }


     }
        if ("about".equals(identifier)) {
        Kuix.alert(Kuix.getMessage("Mobile Astrologer V1.0, Free astrology tool developed by KillerMobi.com It predict your nature, your life path, hurdles in your life and some specific characterstics. It is based on core numerology and calculate your behaviour. Developed by: Rishabh Tripathi (KillerMobi.com)"), KuixConstants.ALERT_OK);
        }
        if ("help".equals(identifier)) {
        Kuix.alert(Kuix.getMessage("Enter your name(preferably birth name) and birth credential and press Go. It will show you a 14 page prediction about your nature which contain your personality, your inner thought and all odds and evens in you. On each page there is a Next button which led you to the next page. For any support or query please contact us at support@killermobi.com"), KuixConstants.ALERT_OK);
        }       

        if ("exitConfirm".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("Do you really want to Exit?"), KuixConstants.ALERT_YES | KuixConstants.ALERT_NO, "exit", null);
            return false;
        }
        if ("exit".equals(identifier)) {
            // get the midlet instance to invoke the Destroy() method
            Home.getDefault().destroyImpl();
            //if the event has been processed, we return 'false' to avoid event forwarding to other frames
            return false;
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

    // specific functions
    public int getValueOfMonth(int no) {
        int val = 0;
        if (no == 1) {
            val = 1;
        } else if (no == 2) {
            val = 2;
        } else if (no == 3) {
            val = 3;
        } else if (no == 4) {
            val = 4;
        } else if (no == 5) {
            val = 5;
        } else if (no == 6) {
            val = 6;
        } else if (no == 7) {
            val = 7;
        } else if (no == 8) {
            val = 8;
        } else if (no == 9) {
            val = 9;
        } else if (no == 10) {
            val = 1;
        } else if (no == 11) {
            val = 11;
        } else if (no == 12) {
            val = 3;
        }
        return val;
    }

    public int getCharValue(char a) {
        int ret = 0;

        if (a == 'a' || a == 'A') {
            ret = 1;
        } else if (a == 'b' || a == 'B') {
            ret = 2;
        } else if (a == 'c' || a == 'C') {
            ret = 3;
        } else if (a == 'd' || a == 'D') {
            ret = 4;
        } else if (a == 'e' || a == 'E') {
            ret = 5;
        } else if (a == 'f' || a == 'F') {
            ret = 6;
        } else if (a == 'g' || a == 'G') {
            ret = 7;
        } else if (a == 'h' || a == 'H') {
            ret = 8;
        } else if (a == 'i' || a == 'I') {
            ret = 9;
        } else if (a == 'j' || a == 'J') {
            ret = 1;
        } else if (a == 'k' || a == 'K') {
            ret = 2;
        } else if (a == 'l' || a == 'L') {
            ret = 3;
        } else if (a == 'm' || a == 'M') {
            ret = 4;
        } else if (a == 'n' || a == 'N') {
            ret = 5;
        } else if (a == 'o' || a == 'O') {
            ret = 6;
        } else if (a == 'p' || a == 'P') {
            ret = 7;
        } else if (a == 'q' || a == 'Q') {
            ret = 8;
        } else if (a == 'r' || a == 'R') {
            ret = 9;
        } else if (a == 's' || a == 'S') {
            ret = 1;
        } else if (a == 't' || a == 'T') {
            ret = 2;
        } else if (a == 'u' || a == 'U') {
            ret = 3;
        } else if (a == 'v' || a == 'V') {
            ret = 4;
        } else if (a == 'w' || a == 'W') {
            ret = 5;
        } else if (a == 'x' || a == 'X') {
            ret = 6;
        } else if (a == 'y' || a == 'Y') {
            ret = 7;
        } else if (a == 'z' || a == 'Z') {
            ret = 8;
        } else {
            ret = 0;
        }
        return ret;
    }

    public int sumOfName(String names) {
        int sum = 0, p, q, r, s;
        for (int i = 0; i < names.length(); i++) {
            sum = sum + getCharValue(names.charAt(i));
        }
        q = sum;
        if (sum >= 100) {
            p = q / 100;
            q = q % 100;
            r = q / 10;
            q = q % 10;
            q = q + p + r;
        }

        while (q > 9 && q != 11 && q != 22) {
            p = q / 10;
            s = q % 10;
            q = p + s;
        }
        return q;
    }

}
