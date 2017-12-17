package com.example.lizhao.myfirstapplication;

/**
 * Created by lizhao on 2017/12/13.
 */

public class Player {
    private int id;
    private String name;
    private int age;
    private String country;
    private String photo;
    private int overall;

    public Player(int id, String name, String country, int age, String photo, int overall) {

        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
        this.photo = photo;
        this.overall = overall;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    @Override
    public String toString() {
        return "Player ID: "+getId()+" name: "+getName()+" country: "+getCountry()+" age: "+getAge()+
                " overall: "+getOverall()+" photo: "+getPhoto();
    }

    public void resetPlayer() {
        setId(-1);
        setAge(-1);
        setCountry("");
        setName("");
        setOverall(-1);
        setOverall(-1);
        setPhoto("");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Player) {
            Player objPlayer = (Player) obj;
            boolean res = true;
            res = res && objPlayer.getPhoto().equals(this.getPhoto()) && objPlayer.getOverall()==this.getOverall()
            && objPlayer.getAge() == this.getAge() && objPlayer.getCountry().equals(this.getCountry())
                    &&objPlayer.getName().equals(this.getName()) && objPlayer.getId()==this.getId();
            return res;
        }
        return false;
    }

}