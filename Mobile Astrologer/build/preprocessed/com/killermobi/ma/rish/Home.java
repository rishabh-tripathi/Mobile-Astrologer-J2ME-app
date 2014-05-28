/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.killermobi.ma.rish;

import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.core.KuixMIDlet;
import org.kalmeo.kuix.widget.Desktop;

/**
 *
 * @author rishabh
 */
public class Home extends KuixMIDlet{

    public void openWeb()
    {
        try{
        this.getMIDlet().platformRequest("http://www.killermobi.com");
        }catch(Exception ee){ee.printStackTrace();}
    }

    public void initDesktopContent(Desktop dsktp) {
        Kuix.getFrameHandler().pushFrame(new HomeFrame());
    }

    public void initDesktopStyles() {
        Kuix.loadCss("style.css");
    }

}
