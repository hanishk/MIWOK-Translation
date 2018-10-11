package com.xyz.miwok;

public class Word {

    private  String mdefaultTranslation;
    private String  mmiwokTranslation;



    public Word(String defaultTranslation,String miwokTranslation){
     mdefaultTranslation= defaultTranslation;
     mmiwokTranslation= miwokTranslation;
    }

    public String getMdefaultTranslation() {
        return mdefaultTranslation;
    }

    public String getMmiwokTranslation() {
        return mmiwokTranslation;
    }
}
