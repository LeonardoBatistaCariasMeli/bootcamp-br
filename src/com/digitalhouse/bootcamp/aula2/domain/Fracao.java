package com.digitalhouse.bootcamp.aula2.domain;

public class Fracao {
    private int p;
    private int q;

    public Fracao(int p, int q) {
        this.p = p;
        this.q = q;
    }

    public int getP() {
        return p;
    }

    public int getQ() {
        return q;
    }

    public void setP(int p) {
        this.p = p;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public void print () {
        if(this.q == 1) {
            System.out.println(this.p);
        }
        else{
            System.out.println(this.p + "/" + this.q);
        }
    }

    public Fracao simplify (Fracao a){
        int mdc = mdc(a.p, a.q);
        return new Fracao (a.p/mdc,a.q/mdc);
    }

    public Fracao add (Fracao a){
        int mmc = mmc(this.q, a.q);
        Fracao sum = new Fracao((mmc/this.q)*this.p + (mmc/a.q)*a.p, mmc );
        return simplify(sum);
    }

    public Fracao add (int a){
        Fracao aFracao = new Fracao(a,1);
        return add(aFracao);
    }

    public Fracao multiply (Fracao a) {
        Fracao mutiplied = new Fracao(this.p * a.p, this.q * a.q);
        return simplify(mutiplied);
    }

    public Fracao multiply (int a) {
        Fracao aFracao = new Fracao(a,1);
        return multiply(aFracao);
    }

    public Fracao divide (Fracao a) {
        Fracao aDivAux = new Fracao(a.q, a.p);
        return multiply(aDivAux);
    }

    public Fracao divide (int a) {
        Fracao aDivAux = new Fracao(1, a);
        return multiply(aDivAux);
    }

    public int mdc (int a, int b) {
        if(b>a){
            return mdc(b,a);
        }
        if (b==0) {
            return a;
        }

        return mdc(b,a%b);
    }

    public int mmc (int a, int b) {
        return ((a * b) / mdc(a,b));
    }
}
