package me.iblitzkriegi.vixio.registration;

import java.util.ArrayList;

/**
 * Created by Blitz on 7/22/2017.
 */
// Vixio.registerCondition(cls, patterns).setName().setDesc();
public class Registration {

    private String name;
    private String desc;
    private String example;
    private Class<?> clazz;
    private String[] syntaxes;
    public Registration(Class<?> cls, String... syntaxes){
        clazz = cls;
        this.syntaxes = syntaxes;
    }

    public Registration(Class clazz, ArrayList<String> patterns) {
        this.syntaxes = patterns.toArray(new String[0]);
    }

    public Registration setName(String s){
        this.name = s;
        return this;
    }
    public Registration setDesc(String s){
        this.desc = s;
        return this;
    }
    public Registration setExample(String s){
        this.example = s;
        return this;
    }
    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.desc;
    }
    public Class<?> getClazz(){
        return clazz;
    }
    public String[] getSyntaxes(){
        return this.syntaxes;
    }
    public String getExample(){
        return this.example;
    }


}