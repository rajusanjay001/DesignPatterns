package com.designpatterns.creational.singleton;


public final class SingleTon {
    private static SingleTon instance;
    public String value;

    private SingleTon(String value){
        this.value=value;
    }

    public SingleTon getInstance(String value){
        if(instance==null){
            synchronized (SingleTon.class){
                if(instance==null){
                    instance=new SingleTon(value);
                }
            }

        }
        return instance;
    }
}
