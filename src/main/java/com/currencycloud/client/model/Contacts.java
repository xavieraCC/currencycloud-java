package com.currencycloud.client.model;

import java.util.List;

public class Contacts extends PaginatedData {

    private List<Contact> contacts;

    public List<Contact> getContacts() {
        return contacts;
    }
}