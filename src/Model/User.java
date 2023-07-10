package model;
/*
 * 
 */
//evelline 03081220027

import java.util.ArrayList;

/*
     * Deskripsi:
     * Atribut
     * name : nama pengguna
     * username : untuk menyimpan nama panggilan pengguna
     * email : untuk menyimpan alamat email pengguna
     * password : untuk menyimpan kata sandi pengguna
     * phoneNumber : untuk menyimpan nama pengguna
     * dateOfBirth : mnyimpan tanggal,bulan,tahun kelahiran pengguna
     * address : menyimpan alamat pengguna
     * Task
     * User dapat mengedit informasi pribadi
     */   
   
public class User {
    private String name;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private String dateOfBirth;
    private String address;
    private ArrayList <Order> order;

    public User(String name, String username, String email, String password, 
        String phoneNumber, String dateOfBirth, String address, ArrayList<Order>order) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.order = order;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Order> getIdOrder() {
        return this.order;
    }

    public void setIdOrder(ArrayList<Order> order) {
        this.order = order;
    }

@Override
public String toString() {
    return "|" +
            "Name:\t\t" + name + " | " +
            "Username:\t" + username + " | " +
            "Email:\t\t" + email + " | " +
            "Password:\t" + password + " | " +
            "Phone number:\t" + phoneNumber + " | " +
            "Birth:\t\t" + dateOfBirth + " | " +
            "Address:\t" + address + " | " +
            "" + order + " | " +
            " ";
}




    public static void add(User user) {
    }
}
