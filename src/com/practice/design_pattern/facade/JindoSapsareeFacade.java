package com.practice.design_pattern.facade;

// facade (여러 클래스의 복잡한 로직 수행)
public class JindoSapsareeFacade {

    private Sapsaree sapsaree;
    private Jindo jindo;

    public JindoSapsareeFacade(Sapsaree sapsaree, Jindo jindo) {
        this.sapsaree = sapsaree;
        this.jindo = jindo;
    }

    public void performActions() {
        jindo.bark();
        jindo.run();
        sapsaree.jump();
        sapsaree.playFetch();
    }

}
