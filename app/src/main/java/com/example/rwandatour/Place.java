package com.example.rwandatour;

public class Place {
    private String mTitle;
    private String mTime;
    private  String mKilometers;
    private  int mImageResourceId;

    public Place(String Title,String Time,String Kilometers){
        mTitle = Title;
        mTime = Time;
        mKilometers = Kilometers;
    }
    public Place(String Title,String Time,String Kilometers,int ImageResourceId){
        mTitle = Title;
        mTime = Time;
        mKilometers = Kilometers;
        mImageResourceId = ImageResourceId;
    }
    public String getTitle(){
        return  mTitle;
    }
    public String getTime(){
        return  mTime;
    }
    public String getKilometers(){
        return  mKilometers;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
}
