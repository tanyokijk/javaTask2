package com.aimiko.helloword.persistence.entity;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public void simplify() {
        int gcd = findGCD(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Fraction add(Fraction other) {
        if (this.denominator == other.getDenominator()) {
           return new Fraction((this.numerator + other.numerator), this.denominator);
        }
        else{
            int commonDenominator = this.denominator * other.denominator;
            return new Fraction((this.numerator * other.denominator + other.numerator * this.denominator), commonDenominator);
        }
    }

    public Fraction subtract(Fraction other) {
        if (this.denominator == other.getDenominator()) {
            return new Fraction((this.numerator - other.numerator), this.denominator);
        }
        else{
            int commonDenominator = this.denominator * other.denominator;
            return new Fraction((this.numerator * other.denominator - other.numerator * this.denominator), commonDenominator);
        }
    }

    public Fraction multiply(Fraction other) {
        return new Fraction((this.numerator* other.numerator), (this.denominator* other.denominator));
    }

    public Fraction divide (Fraction other){
        int temp = other.numerator;
        other.numerator=other.denominator;
        other.denominator=temp;
        return new Fraction((this.numerator* other.numerator), (this.denominator* other.denominator));
    }
}
