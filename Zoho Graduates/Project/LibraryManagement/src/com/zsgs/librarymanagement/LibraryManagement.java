package com.zsgs.librarymanagement;

import com.zsgs.librarymanagement.login.LoginView;

public class LibraryManagement {
    private static LibraryManagement libraryManagement;

    private String appName = "Library Management System";

    private String appVersion = "0.1.0";

    private LibraryManagement() {

    }

    public static LibraryManagement getInstance() {
        if (libraryManagement == null) {
            libraryManagement = new LibraryManagement();
        }
        return libraryManagement;
    }

    private void create() {
        LoginView login = new LoginView();
        login.init();
    }

    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public static void main(String[] args) {
        LibraryManagement.getInstance().create();
    }
}
