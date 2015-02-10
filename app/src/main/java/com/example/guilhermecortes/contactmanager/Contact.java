package com.example.guilhermecortes.contactmanager;

import android.net.Uri;

/**
 * Created by guilhermecortes on 23/01/15.
 */
public class Contact {

    private String _name, _phone, _email, _address;
    private Uri _imageURI;

    public Contact(String name, String phone, String email, String address, Uri imageURI){
        _name = name;
        _phone = phone;
        _email = email;
        _address = address;
        _imageURI = imageURI;
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

    public Uri get_imageURI() {
        return _imageURI;
    }

    public void set_imageURI(Uri _imageURI) {
        this._imageURI = _imageURI;
    }
}
