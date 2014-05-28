/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.killermobi.ma.rish;

/**
 *
 * @author rishabh
 */
public class theSoulUrge {

    public theSoulUrge() {
    }

    public String getMotive(int no)
    {
        String motive=null;
        if(no==1)
        {
            motive="You wants to be the leader or organizer, free to initiate or pioneer in any venture that strikes your fancy. You prefers to take a strong individualistic stand, dominating any situation in which you are involved. You wants to be a success in large, progressive enterprises. You are concerned primarily with the broad strokes, prefers to leave the details to others. You keeps your own counsel, works with a few hand-picked employees.";
        }
        else if(no==2)
        {
            motive="You would like friendship, affection, love, companionship. You usually prefers marriage to being single. You wants to work with others as part of a cooperative team, only rarely wants to lead. You will work hard to achieve a harmonious environment with sensitive, genial people.";
        }
        else if(no==3)
        {
            motive="You wants to participate in an active social life with many close friends and diverse activities. You would like to express your artistic talents, particularly your talent with words: speaking, writing, acting, and singing. You wants your home and work environment to reflect the beauty you created.";
        }
        else if(no==4)
        {
            motive="You would like to lead a stable life. You prefers orderliness and a systematic approach in your endeavors. You wants to serve others methodically and diligently. You wants to be involved in solid, conventional, well-regulated activities. You are likely to be disturbed by innovation and erratic or sudden changes.";
        }
        else if(no==5)
        {
            motive="You would like to have a life of freedom, excitement, unexpected happenings, unusual adventures, travel. You don't want to be governed by standard values or traditions. You wants to be the one to set the pace.";
        }
        else if(no==6)
        {
            motive="You would like to be appreciated for your ability to handle responsibilities. Your home and family are likely to be a strong focus in your life. You wants to rectify and balance situations in which you involved. You prefers to work with others. You are concerned with beauty in your surrounding and often expresses yourself in creative or artistic activities.";
        }
        else if(no==7)
        {
            motive="You would like much time alone, much quiet and retirement from the outer world in order to develop your inner resources. You likes to dream and develop your idealistic understandings, to learn the deeper truths. You prefers contemplation to activity and adventure. You prefer to avoid business world.";
        }
        else if(no==8)
        {
            motive="You want wealth, success, status and power. You want to excel in the business or political world, to organize, supervise or lead. You probably have substantial material needs to satisfy.";
        }
        else if(no==9)
        {
            motive="You would like helping others, usually in a humanitarian or philanthropic manner. Sometimes, You wants to give friendship, affection and love; sometimes, you give your knowledge and experience. You also would like to share your artistic or creative talents with others.";
        }
        else if(no==11)
        {
            motive="You would like to manifest your view on spiritual matters. You want to give yourself to humanity. You are often more concerned with the abstraction of giving to the world rather than specifically giving to individuals.";
        }
        else if(no==22)
        {
            motive="You would like to use your abilities in an important humanitarian undertaking. You want to express the significant power, as a builder, engineer, diplomat, etc. In some way, You want to make a considerable contribution to the world.";
        }
        else
        {
            motive="";
        }
        return motive;
    }

    public String getPositiveAttitude(int no)
    {
        String pos=null;
        if(no==1)
        {
            pos="Ambitious, determined. Honest, loyal. Instigates action. Seeks opportunities to use your abilities. ";
        }
        else if(no==2)
        {
            pos="Sympathetic, concerned, devoted. Sensitive, diplomatic, tactful, emotional. Quietly persuasive rather than forceful. Friendly. Gives love and affection.";
        }
        else if(no==3)
        {
            pos="Friendly, outgoing, social. Rarely discouraged. Good mental/emotional balance. Intuitive. Often inspirational. Capable of self-expression, either in social situations or in artistic fields.";
        }
        else if(no==4)
        {
            pos="Good at organizing, systematizing, managing. Good at establishing routine and order. Logical, thorough, exacting with details. Responsible, reliable. Honest, sincere, conscientious. Hates pretension. Practical and analytical. Self-disciplined, determined, tenacious. ";
        }
        else if(no==5)
        {
            pos="Very adaptable and versatile. Natural resourcefulness, enthusiasm. Capable of bringing new excitement into your interests. Progressive approach, strong feelings. Good mind and imagination.";
        }
        else if(no==6)
        {
            pos="Responsible. Open-minded, sympathetic, understanding, generous. Give much friendship, affection, love. Expresses deep emotional life. Idealistic. Natural ability to serve, help and teach - capable of sacrifice if necessary. Artistic and creative expression. ";
        }
        else if(no==7)
        {
            pos="Good mind, Analytical approach. Studious, theoretical approach. Technical, scientific, religious or occult interests. Reserved. Seek perfection.";
        }
        else if(no==8)
        {
           pos="Executive abilities, proceeds in businesslike manner. Confidence, energy and ambition. Analytical mind. Possesses good judgment. Have good sense of material values and is good judge of character. Capable of the imagination required for commercial success. Functions well in emergencies. Inspired by crises or large odds. Self-controlled. Emotions rarely cloud judgments.";
        }
        else if(no==9)
        {
            pos="Sympathetic, generous, kind. Sensitive nature. Expresses love, compassion, tolerance. Possesses deep, intuitive understanding of life. Possesses innate wisdom, good intuition, and broad point of view. Often high ideals and an inspirational approach. Often self-sacrificing. Gives freely without being concerned about any return or reward.";
        }
        else if(no==11)
        {
            pos="Utopian dreamer. Idealistic, intuitive and inspirational. Religious and spiritual, possibly psychic ability. Much inner strength and devotion to a chosen cause, sticks to his ideals. Good mind.";
        }
        else if(no==22)
        {
            pos="Universal outlook with a practical approach. High intelligence. Unusual perceptions and awareness. Diplomatic ability. High ideals. Strong capability and leadership ability. Commands respect with your superior vision. ";
        }
        else
        {
            pos="";
        }
    return pos;
    }

    public String getNegativeAttitude(int no)
    {
        String neg=null;
        if(no==1)
        {
            neg="Egotistical. Impatient, disapproving. Dominant, bossy. Headstrong, impulsive. Conceited.";
        }
        else if(no==2)
        {
            neg="Over-sensitive. Too delicate ego is easily hurt. May be timid or fearful. Not given to disciplining yourself or others. Too easy going-may becomes a doormat.";
        }
        else if(no==3)
        {
            neg="Tendency to scatter forces. Too easy going and optimistic. Too sensitive when criticized. Compulsive talker may be critical.";
        }
        else if(no==4)
        {
            neg="Rigid, stubborn, narrow-minded. Hides feeling. Often, is not aware of real feelings. Bossy, dominant. May neglect large affairs because of blind involvement in details. Afraid to take chances.";
        }
        else if(no==5)
        {
            neg="Restless and impatient. Dislikes routine and detail work. Jumps from interest to interest, activity to activity. Discards quickly to go on to the new. Rarely holds to anything. May have difficulty with responsibility.";
        }
        else if(no==6)
        {
            neg="Too emotional. Interfering or too protective rather than helpful. Often represses own needs in order to serve others - may become resentful.";
        }
        else if(no==7)
        {
            neg="Timid and withdrawn, innately shy, difficulty with casual conversation. Lives in dreams and fantasies. Difficult for others to understand. Others have difficulty showing affection. Represses most emotions although the emotions are often very strong. Secretive, selective. Not too adaptable.";
        }
        else if(no==8)
        {
           neg="Dominating. Too exacting. Thinking, straining, striving for material values, financial success - sometimes to exclusion of all else. Tendency to be very self-centered. Tendency to rigidity, stubbornness. Represses feelings.";
        }
        else if(no==9)
        {
            neg="May be too sensitive; very emotional with emotions being expressed strongly. Conflict between higher spiritual aims and personal ambitions may cause difficulties. May resent necessity of giving so much of the time. May be disappointed in lack of perfection in yourself and others. Moody, critical.";
        }
        else if(no==11)
        {
            neg="Nervous tension brought on by high level awareness. Too sensitive. May be very emotional or may repress feelings altogether. In either case, the sensitivity is poorly handled. Strong ideas of right and wrong, often inflexible. Day dreams and deceives self. Impractical approach.(often can't see these qualities in yourself). Often extremely selective in associations. Others may be bothered by your air of exclusivity.";
        }
        else if(no==22)
        {
            neg="Nervous tension brought on by high level awareness. Too dominating.";
        }
        else
        {
            neg="";
        }
    return neg;
    }
}
