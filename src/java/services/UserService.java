/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.UserDB;
import java.util.List;
import models.User;

/**
 *
 * @author king_wizard
 */
public class UserService {
    public User get(String email) throws Exception {
        // creating a note database class
        // creating an instance of notedb class
        UserDB userDB = new UserDB();
        // using the get method from the notedb class
        User user = userDB.get(email);
        return user;
    }

    // get all notes
    public List<User> getAll() throws Exception {
        // creating an instance of notedb class
        UserDB userDB = new UserDB();
        // using the getAll method from the notedb class
        List<User> users = userDB.getAll();
        return users;
    }
/*
    public void insert(String title, String contents, String owner) throws Exception {
        // 0 = id --> id is autoincrement --> it is 0 and mysql must set a good id for it
        Note note = new Note(0, title, contents, owner);
        // creation of an instance again
        NoteDB noteDB = new NoteDB();
        // using the insert method from notedb
        noteDB.insert(note);
    }

    public void update(int noteId, String title, String contents, String owner) throws Exception {
        // since we have all the data needed we create a javabean object
        Note note = new Note(noteId, title, contents, owner);
        // creating an instance of the notedb class
        NoteDB noteDB = new NoteDB();
        // using the update method from the notedb class
        noteDB.update(note);
    }
*/
    public void delete(String email) throws Exception {
        // getting a note and then sending a note to the notedb and 
        // using the delete method from the notedb class to delete
        
        // creating an instance with the javabean
        User user = new User();
        // calling the setter for the id from said javabean
        user.setEmail(email);
        // creating an instance of the notedb class
        UserDB userDB = new UserDB();
        // using the delete method from the notedb class
        userDB.delete(user);
    }


}
