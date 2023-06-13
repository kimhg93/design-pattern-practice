package com.practice.design_pattern.proxy;

// proxy
public class JindoMom implements Dog {

    private Jindo jindo;
    private boolean isOwner;


    public JindoMom(boolean isOwner){
        this.isOwner = isOwner;
    }

    @Override
    public void action() {
        if(isOwner){
            this.jindo = new Jindo();
            System.out.println("주인이다!");
            jindo.action();
        } else {
            System.out.println("짖는다! (jindo 가 보호됨)");
        }
    }

}
