package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String aut;
    private String lang;
    private String msg;
    private String msg2;
    private DateTime dt = new DateTime(); 
        
    public MessageBean() {
    }
    
    public String getAut() {
        return "Lucas Costa";
    }
    
    public void setLang(String value) {
        lang = value;
    }

    public String getMsg() {
        switch (this.lang){
            case "pt":
                if ((dt.getHourOfDay() >= 5) && (dt.getHourOfDay() <= 11)) {
                    return "Bom dia";
                } else if (dt.getHourOfDay() >= 12 && dt.getHourOfDay() < 19) {
                    return "Boa tarde";
                } else {
                    return "Boa noite";
                }
            case "en":
                if ((dt.getHourOfDay() >= 5) && (dt.getHourOfDay() <= 11)) {
                    return "Good morning";
                } else if (dt.getHourOfDay() >= 12 && dt.getHourOfDay() < 19) {
                    return "Good afternoon";
                } else {
                    return "Good night";
                }
            case "de":
                if ((dt.getHourOfDay() >= 5) && (dt.getHourOfDay() <= 11)) {
                    return "Guten Morgen";
                } else if (dt.getHourOfDay() >= 12 && dt.getHourOfDay() < 19) {
                    return "Guten Tag";
                } else {
                    return "Guten Nacht";
                }
            case "fr":
                if ((dt.getHourOfDay() >= 5) && (dt.getHourOfDay() <= 11)) {
                    return "Bonjour";
                } else if (dt.getHourOfDay() >= 12 && dt.getHourOfDay() < 19) {
                    return "Bonne aprés-midi";
                } else {
                    return "Bonne nuit";
                }
        }
        return "";
    }
    public String getMsg2() {
        switch (this.lang){
            case "pt":
                return "Elaborado por";
            case "en":
                return "Created by";
            case "de":
                return "Erstellt von";
            case "fr":
                return "Créé par";
        }
        return "";
    }
}
