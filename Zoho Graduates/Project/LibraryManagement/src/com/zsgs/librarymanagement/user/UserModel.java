package com.zsgs.librarymanagement.user;

import com.zsgs.librarymanagement.Librarydatabase.LibraryDatabase;
import com.zsgs.librarymanagement.model.User;

import java.util.List;

public class UserModel {
    UserView userView;

    public UserModel(UserView userView) {
        this.userView = userView;
    }

    public void addNewUser(User user) {
        LibraryDatabase.getInstance().addNewUser(user);
    }

    public List<User> getAllUsers() {
        return LibraryDatabase.getInstance().getUserList();
    }

    public void removeUserById(int userId) {
        if (LibraryDatabase.getInstance().removeUserById(userId)) {
            userView.showAlert("User removed successfully");
        } else {
            userView.showAlert("User not found");
        }
    }

}
