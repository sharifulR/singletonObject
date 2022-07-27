package com.example.singletonobject.singleobject;

public class UsersBase {
    private static UsersBase usersBase;

    public UsersBase() {
    }
    public static UsersBase getUsersBase(){
        if (usersBase==null){
            usersBase=new UsersBase();
        }
        return usersBase;
    }
}
