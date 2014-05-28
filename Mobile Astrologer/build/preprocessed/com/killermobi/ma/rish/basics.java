/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.killermobi.ma.rish;

/**
 *
 * @author rishabh
 */
public class basics {

    public basics()
    {

    }
    
    public String getKeywords(int no)
    {
        String keyword=null;
        if(no==1)
        {
            keyword="<b>Individuation, Independence, Attainment</b>";
        }
        else if(no==2)
        {
            keyword="<b>Relation, Cooperation</b>";
        }
        else if(no==3)
        {
            keyword="<b>Expression, Joy of Living</b>";
        }
        else if(no==4)
        {
            keyword="<b>Limitation, Order, Service</b>";
        }
        else if(no==5)
        {
            keyword="<b>CONSTRUCTIVE FREEDOM</b>";
        }
        else if(no==6)
        {
            keyword="<b>Balance, Responsibility, Love</b>";
        }
        else if(no==7)
        {
            keyword="<b>ANALYSIS, UNDERSTANDING</b>";
        }
        else if(no==8)
        {
            keyword="<b>MATERIAL SATISFACTION</b>";
        }
        else if(no==9)
        {
            keyword="<b>SELFLESSNESS, HUMANITARIANISM</b>";
        }
        else if(no==11)
        {
            keyword="<b>ILLUMINATION</b>";
        }
        else if(no==22)
        {
            keyword="<b>MASTER BUILDER</b>";
        }
        else
        {
          keyword = "Error!!!";
        }
        return keyword;
    }
    public String getBasicDetails(int no)
    {
        String basicDetails=null;
        if(no==1)
        {
            //basicDetails = "एक व्यक्ति खुद को अन्य लोगों से अलग और अपने ही individuation स्वीकार करना चाहिए. व्यक्ति को अपने दम पर खड़े हैं और स्वतंत्रता के लिए निर्भरता से जाने की क्षमता विकसित करना है. एक स्वतंत्र, व्यक्ति को एक व्यक्ति के रूप में बनाने और अग्रणी के लिए प्राप्ति के लिए उनकी क्षमता के बारे में जानते हो जाता है जब प्रमुख और प्रबंध जब अन्य लोगों के साथ काम करने के लिए अकेले काम करते हैं.";
            basicDetails="You must distinguish yourself from other people and acknowledge your own Individuation. You have to develop the capability of standing on your own and going from dependence to Independence. On independence, you becomes aware of your potential for Attainment as an individual for creating and pioneering when work alone and for leading and managing when working with others.";
        }
        else if(no==2)
        {
            basicDetails="Independence is important but has its limitations. There are other people all about, and another lesson involves being a meaningful part of a group-a small group like family or friends, a larger group like a business or community. You must learn adaptability, service, consideration for others i.e. meaning of a RELATION with others, the idea of COOPERATION.";
        }
        else if(no==3)
        {
            basicDetails="You must discover, both as an individual and as a group member, your capability of EXPRESSION: (1) artistic expression - Writing, painting, sculpting, singing or any of the many other means of expressing inner thoughts and emotions, and (2) Expression of feeling towards others - friendship, affection and love. The JOY OF LIVING can be expressed with optimism and enthusiasm.";
        }
        else if(no==4)
        {
            basicDetails="Life doesn't always present opportunities for singing and laughing. You must learn the law of LIMITATION. Everyone has - limitation presented by the environment, by the physical body, by the restrictions of the individual's view point. Rather than struggling against these limits, it is necessary to learn to live with them, to accept them and to make a meaningful existence. You embarking on this course must learn system and organization order on a practical level. You must be prepared to be in SERVICE of others.";
        }
        else if(no==5)
        {
            basicDetails="You must learn the constructive use of freedom. You must not waste your many talents or misuse your ongoing opportunities; you must not get lost in solely physical desires - food, sex, alcohol, drugs. You must not scatter your potential and end up with frustration. You must make a meaningful existence by using freedom productively.";
        }
        else if(no==6)
        {
            basicDetails="You must learn to give love and harmony, sympathy and understanding, protection and BALANCE. Along with the balancing, the lesson of RESPONSIBILITY can be meaningful one. Others will recognize your strength, and you may be expected to help them. You are the one who holds the family together in difficult situations . You may choose to limit yourself to your family, your friends, possibly the close community. The friendship and LOVE you express to others will come back to you from those you help. You can bask in the glory of a job well done and the quiet reward of friendship and love returned.";
        }
        else if(no==7)
        {
            basicDetails="There's a time for introspection, a time to subject all an individual knows to mental ANALYSIS, so that eventually you possess much of knowledge and UNDERSTANDING. Spiritual awareness is employed, and emphasis of material matters avoided. Desire for material accumulation will probably leads the individual off the track, for this is a time for study and meditation, a time to know oneself - In the deepest way.";
        }
        else if(no==8)
        {
            basicDetails="You must learn to deal with the material things of life. Striving for power and high material goals may make you aware of the limitations of your ability or the restrictions of your circumstances.";
        }
        else if(no==9)
        {
            basicDetails="There's a time to learn the satisfaction of giving to your fellowman. The satisfactions come from the giving. There is little reward-the love and friendship are sometimes returned, the obligation often not repaid. You must place all others before yourself, must give for the sheer pleasure of giving, because you have learned the ultimate satisfaction of SELFLESSNESS and HUMANITARIANISM.";
        }
        else if(no==11)
        {
            basicDetails="You must work to develop intuition. In your life, you must be inspired by your own example, spreading your ILLUMINATION to others. You have to learn to live with your special powers, to set yourself aside from the world of material accumulation in order to better understand the powerful forces which can reveal a higher guidance.";
        }
        else if(no==22)
        {
            basicDetails="You are potentially capable of combining idealism with the ability to put these ideals into a concrete form. Enormous power is available to you to produce on a significant scale, for the benefit of humanity. When the potential can be realized, you become a master builder, capable of feats well beyond all others.";
        }
        else
        {
            basicDetails="Error in calcularion, Either Name or Date of Birth are in improper format.";
        }
        return basicDetails;
    }

    public String luckyNumber(int no,int month)
    {
        String ln = null;

        if(month==1)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>1,4,10,13,22,19,22,28 and 31</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2013,22,31,40,49,58,67,76</u>";
            }
            else if(no==2)
            {
                         ln="Your <b>lucky numbers</b> are <u>2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>2,7,11,20,20,16,25,20,25 and 29</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,16,25,20,25,29,34,38,43,47,52,56,61,65,70,74</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3 and 8</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66 and 2017,35,44,53,62,71</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4 and 1</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 1,10,28</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2010,28,37,46,55,64</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5 and all other numbers except 4 and 8</u>." +
                  " Your <b>lucky dates</b> are <u>5 and 14</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,23,32,41,50,59,68 and 77</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6 and all other numbers except 4 and 8</u>." +
                  " Your <b>lucky dates</b> are <u>6 and 15</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,33,42,51,60,69</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7 and 2</u>." +
                  " Your <b>lucky dates</b> are <u>7,16 and 2,11,20,29</u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72</u>";
            }
        }
        else if(month==2)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1,3 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28,3,12,21,30 and 4,13,22,31</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2013,22,31,40,49,58,67,76</u>";
            }
            else if(no==2)
            {
                         ln="Your <b>lucky numbers</b> are <u>2,3 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29,3,12,21,30,7 and 16</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2012,30,39,48,57,66 and 2016,34,43,52,61,70</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3 and 8</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66 and 2017,35,44,53,62,71</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>1 and avoid 4 and 8</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,28,37,46,55,64</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5</u>." +
                  " Your <b>lucky dates</b> are <u>5 and 14</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,23,32,41,50,59,68 and 77</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6</u>." +
                  " Your <b>lucky dates</b> are <u>6 and 15</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,33,42,51,60,69</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7 and 2</u>." +
                  " Your <b>lucky dates</b> are <u>7,16 and 2,11,20,29</u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72</u>";
            }
        }
        else if(month==3)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1,3 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28,3,12,21,30 and 4,13,22,31</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2013,22,31,40,49,58,67,76</u>";
            }
            else if(no==2)
            {
                         ln="Your <b>lucky numbers</b> are <u>2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29,7 and 16</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2016,34,43,52,61,70</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3</u>." +
                  " Your <b>lucky dates</b> are <u>3,12 and 30</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4,1 and 3</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28 and 4,13,22,31</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,28,37,46,55,64 and 2013,31,40,49,58,67</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5 and 3</u>." +
                  " Your <b>lucky dates</b> are <u>5,3,12,21,14,23,30</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,32,41,50,59,68,77 and 2012,30,39,48,57,66</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6 and 3</u>." +
                  " Your <b>lucky dates</b> are <u>6,3,12,21,15 and 30</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,33,42,51,60,69 and 2012,30,39,48,57,66</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7,2 and 3</u>." +
                  " Your <b>lucky dates</b> are <u>7,16 and 2,11,20,29</u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8,3 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9 avoid 4 and 8</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72</u>";
            }
        }
        else if(month==4)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1 and 9. Avoid 4 and 8</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28 and 9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2018,27,36,45,54,63,72</u>";
            }
            else if(no==2)
            {
                         ln="Your <b>lucky numbers</b> are <u>2,7 and 9</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29,7,16 and 9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2016,34,43,52,61,70 and 2018,27,36,45,54,63,72</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3,6,9</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30 and 6,15 and 9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66 and 2015,33,42,51,60,69 and 18,27,36,45,54,63,72</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4,1 and 9</u>." +
                  " Your <b>lucky dates</b> are <u>8,17 and 4,13,22,31</u>." +
                  "The most <b>important years</b> of your life will be <u>2017,35,44,53,62,71 and 2013,31,40,49,58,67</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5 and 9</u>." +
                  " Your <b>lucky dates</b> are <u>5,9,14,23,18,27,30</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,32,41,50,59,68,77 and 2018,27,36,45,54,63,72</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6,3 and 9</u>." +
                  " Your <b>lucky dates</b> are <u>6,9,18,27,15,24 and 27</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,33,42,51,60,69 and 2018,27,36,45,54,63,72</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7 and 2</u>." +
                  " Your <b>lucky dates</b> are <u>7,16 and 2,11,20,29</u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9 and 1</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72</u>";
            }
        }
        else if(month==5)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1,2 and 6</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28,2,11,20,29 and 6,15</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2011,29,38,47,56,65 and 2015,33,42,51,60,69</u>";
            }
            else if(no==2)
            {
                         ln="Your <b>lucky numbers</b> are <u>2,7 and 6</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29,7,16 and 6,15</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2016,34,43,52,61,70 and 2015,33,42,51,60,69</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3,6,5</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30 and 6,15</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66 and 2015,33,42,51,60,69</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4,6 and 8</u>." +
                  " Your <b>lucky dates</b> are <u>8,17 and 4,13,22,31</u>." +
                  "The most <b>important years</b> of your life will be <u>2017,35,44,53,62,71 and 2013,31,40,49,58,67</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5 and 6</u>." +
                  " Your <b>lucky dates</b> are <u>5,6,14,23,15,24,30</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,32,41,50,59,68,77 and 2015,33,42,51,60,69</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6,3 and 2</u>." +
                  " Your <b>lucky dates</b> are <u>6,15,24 and 2,11,20,29</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,33,42,51,60,69 and 2011,29,38,47,56,65</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7,2 and 6</u>." +
                  " Your <b>lucky dates</b> are <u>7,16 and 2,11,20,29 and 6,15</u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65 and 2015,33,42,51,60,69</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9 and 6</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27 and 6,15</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72 and 2015,33,42,51,60,69</u>";
            }
        }
        else if(month==6)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1,4 and 5</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28,4,13,22,31 and 5,14</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2013,31,40,49,58,67 and 2014,32,41,50,59,68</u>";
            }
            else if(no==2)
            {
                         ln="Your <b>lucky numbers</b> are <u>2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29 and 5,14,23,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2014,32,41,50,59,68</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3 and 5</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4 and 5. Avoid 3</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 5,14,23,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2014,32,41,50,59,68</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5</u>." +
                  " Your <b>lucky dates</b> are <u>5,14,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,32,41,50,59,68,77</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6 and 5</u>." +
                  " Your <b>lucky dates</b> are <u>6,15,24 and 5,14,23,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,33,42,51,60,69 and 2014,32,41,50,59,68</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7,2 and 5</u>." +
                  " Your <b>lucky dates</b> are <u>7,16 and 2,11,20,29 </u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9 and 5</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27 and 5,14,23,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72 and 2014,23,32,41,50,59,68</u>";
            }
        }
        else if(month==7)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1,2,4 and 5. Avoid 4 and 8</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,2,11,20,28,4,13,22,31 and 5,14</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2013,31,40,49,58,67 and 2014,32,41,50,59,68</u>";
            }
            else if(no==2)
            {
                         ln="Your <b>lucky numbers</b> are <u>1,2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29 and 5,14,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2014,32,41,50,59,68</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3,2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30,2,11,20 and 7,16,25</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66 and 2011,20,29,38,47,56,65 and 2016,25,34,43,52,61,70</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4 and 8. Avoid 3</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17,26</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,26,35,44,53,62,71</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5,2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>5,14,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,32,41,50,59,68,77</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6,2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>6,15,24</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,26,33,42,51,60,69</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7 and 2</u>." +
                  " Your <b>lucky dates</b> are <u>7,16 and 2,11,20,29 </u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9,2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27,2,11,20</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72</u>";
            }
        }
        else if(month==8)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1 and 4.</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28,4,13,22,31</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2013,31,40,49,58,67</u>";
            }
            else if(no==2)
            {
                         ln="Your <b>lucky numbers</b> are <u>2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29 and 7,16,25</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2016,25,34,43,52,61,70</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3,1 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30,1,10,28 and 7,16,25</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66 and 2010,28,37,46,55,64 and 2016,25,34,43,52,61,70</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4 and 8.</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17,26</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,26,35,44,53,62,71</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5 and 1</u>." +
                  " Your <b>lucky dates</b> are <u>5,14,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,32,41,50,59,68,77</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6,1 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>6,15,24</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,26,33,42,51,60,69 and 2010,28,37,46,55,64</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7 and 2</u>." +
                  " Your <b>lucky dates</b> are <u>7,16 and 2,11,20,29 </u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72</u>";
            }
        }
        else if(month==9)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1 and 5.</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73</u>";
            }
            else if(no==2)
            {
                         ln="Your <b>lucky numbers</b> are <u>2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29 and 7,16,25</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2016,25,34,43,52,61,70</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3,5 and 6</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30,5,14,23,6,15,24</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66 and 2014,23,32,41,50,59,68 and 2015,24,33,42,51,60,69</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4 and 8.</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17,26</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,26,35,44,53,62,71</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5</u>." +
                  " Your <b>lucky dates</b> are <u>5,14,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,32,41,50,59,68,77</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6,5</u>." +
                  " Your <b>lucky dates</b> are <u>6,15,24,5,14,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,26,33,42,51,60,69 and 2014,23,32,41,50,59,68</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7 and 2</u>." +
                  " Your <b>lucky dates</b> are <u>7,16 and 2,11,20,29 </u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9,5 and sometimes 6</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72 and 2014,23,32,41,50,59,68</u>";
            }
        }
        else if(month==10)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1,6 and 8.</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28,6,15,24</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2015,24,33,42,51,60,69</u>";
            }
            else if(no==2)
            {
                         ln="Your <b>lucky numbers</b> are <u>2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29 and 7,16,25</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2016,25,34,43,52,61,70</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3 and 6</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30,6,15,24</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66 and 2015,24,33,42,51,60,69</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4 and 8.</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17,26</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,26,35,44,53,62,71</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5 and 6</u>." +
                  " Your <b>lucky dates</b> are <u>5,14,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,32,41,50,59,68,77</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6</u>." +
                  " Your <b>lucky dates</b> are <u>6,15,24</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,26,33,42,51,60,69</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7 and 2</u>." +
                  " Your <b>lucky dates</b> are <u>7,16 and 2,11,20,29 </u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9 and sometimes 6</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72</u>";
            }
        }
        else if(month==11)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1,2,4 and 7.</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28,4,13,22</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2013,22,31,40,49,58,67</u>";
            }
            else if(no==2)
            {
                     ln="Your <b>lucky numbers</b> are <u>2 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29 and 7,16,25</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2016,25,34,43,52,61,70</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3 and 9</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30,9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66 and 2018,27,36,45,54,63,72</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4,8 and 9.</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17,26</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,26,35,44,53,62,71</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5 and 9</u>." +
                  " Your <b>lucky dates</b> are <u>5,14,23,9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,32,41,50,59,68,77 and 2018,27,36,45,54,63,72</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>6 and 9</u>." +
                  " Your <b>lucky dates</b> are <u>6,15,24,9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,26,33,42,51,60,69 and 2018,27,36,45,54,63,72</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7,9 and 2</u>." +
                  " Your <b>lucky dates</b> are <u>7,25,16 and 2,11,20,29 </u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8,9 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72</u>";
            }
        }
        else if(month==12)
        {
            if(no==1)
            {
                ln="Your <b>lucky numbers</b> are <u>1 and 3.</u>." +
                  " Your <b>lucky dates</b> are <u>1,10,28,3,12,21</u>." +
                  "The most <b>important years</b> of your life will be <u>2010,19,28,37,46,55,64,73 and 2012,21,30,39,48,57,66</u>";
            }
            else if(no==2)
            {
                     ln="Your <b>lucky numbers</b> are <u>2,3 and 7</u>." +
                  " Your <b>lucky dates</b> are <u>2,11,20,29 and 7,16,25</u>." +
                  "The most <b>important years</b> of your life will be <u>2011,29,38,47,56,65 and 2016,25,34,43,52,61,70</u>";
            }
            else if(no==3)
            {
                     ln="Your <b>lucky numbers</b> are <u>3,6 and 9</u>." +
                  " Your <b>lucky dates</b> are <u>3,12,21,30,9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2012,30,39,48,57,66 and 2018,27,36,45,54,63,72</u>";
            }
            else if(no==4)
            {
                    ln="Your <b>lucky numbers</b> are <u>4,8 and 9.</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17,26</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,26,35,44,53,62,71</u>";
            }
            else if(no==5)
            {
                    ln="Your <b>lucky numbers</b> are <u>5 and 3</u>." +
                  " Your <b>lucky dates</b> are <u>5,14,23</u>." +
                  "The most <b>important years</b> of your life will be <u>2014,32,41,50,59,68,77</u>";
            }
            else if(no==6)
            {
                    ln="Your <b>lucky numbers</b> are <u>3,6 and 9</u>." +
                  " Your <b>lucky dates</b> are <u>6,15,24,9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2015,26,33,42,51,60,69 and 2018,27,36,45,54,63,72</u>";
            }
            else if(no==7)
            {
                    ln="Your <b>lucky numbers</b> are <u>7 and 2</u>." +
                  " Your <b>lucky dates</b> are <u>7,25,16 and 2,11,20,29 </u>." +
                  "The most <b>important years</b> of your life will be <u>2016,34,43,52,61,70 and 2011,29,38,47,56,65</u>";
            }
            else if(no==8)
            {
                    ln="Your <b>lucky numbers</b> are <u>8 and 4</u>." +
                  " Your <b>lucky dates</b> are <u>4,13,22,31 and 8,17</u>." +
                  "The most <b>important years</b> of your life will be <u>2013,31,40,49,58,67 and 2017,35,44,53,62,71</u>";
            }
            else if(no==9)
            {
                    ln="Your <b>lucky numbers</b> are <u>9</u>." +
                  " Your <b>lucky dates</b> are <u>9,18,27</u>." +
                  "The most <b>important years</b> of your life will be <u>2018,27,36,45,54,63,72</u>";
            }
        }

        return ln;
    }

}
