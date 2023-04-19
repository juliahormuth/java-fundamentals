package com.github.juliahormuth.heritage;

public class Student extends Person {

    private double[] notes;

    public double[] getNotes() {
        return notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }

    public double calculateNotes() {
        return 0;
    }

    public boolean verifyApproved() {
        return true;
    }
}
