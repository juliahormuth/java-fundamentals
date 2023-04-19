package com.github.juliahormuth.relationship;

public class Test {

    public static void main(String[] args) {

        Contact contact = new Contact();
        contact.setName("Julia");

        Phone phone1 = new Phone();
        phone1.setNumber("8873478347");

        Phone[] phones = new Phone[1];
        phones[0] = phone1;

        contact.setPhone(phones);

        Address add = new Address();
        add.setName("Av. Teste");
        add.setState("São Paulo");
        add.setCity("Arujá");
        add.setZipCode("0748-912");

        contact.setAddress(add);

        if (contact != null && contact.getAddress() != null)  {
            System.out.println(contact.getAddress().getName());
        }

        if (contact != null && contact.getPhone() != null)  {
            for (Phone phone : contact.getPhone()) {
                System.out.println(phone.getNumber());
            }
        }
    }
}
