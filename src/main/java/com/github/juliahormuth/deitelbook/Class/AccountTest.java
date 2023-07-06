package com.github.juliahormuth.deitelbook.Class;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account();

        System.out.println(myAccount.getName()); //null
        myAccount.setName("Julia");
        System.out.println(myAccount.getName());
    }
}
