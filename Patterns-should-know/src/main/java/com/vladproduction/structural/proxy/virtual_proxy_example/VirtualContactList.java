package com.vladproduction.structural.proxy.virtual_proxy_example;

import java.util.List;

// Virtual Subject - lazy initialization
// delays creation of the expensive object
public class VirtualContactList implements ContactList{

    private RealContactList realContactList;

    @Override
    public List<String> getContactList() {
        if (realContactList == null) {
            System.out.println("Virtual Proxy creating real contact list on demand");
            realContactList = new RealContactList();
        }
        return realContactList.getContactList();
    }

}
