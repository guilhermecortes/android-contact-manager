package com.example.guilhermecortes.contactmanager;

/**
 * Created by guilhermecortes on 23/01/15.
 */
public class Contact {

    private String _name, _phone, _email, _address;

    public Contact(String name, String phone, String email, String address){
        _name = name;
        _phone = phone;
        _email = email;
        _address = address;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }
}
