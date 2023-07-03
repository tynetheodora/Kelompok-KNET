package model;
/*
 * 
 */
//evelline 03081220027
 
    /*
     * Deskripsi:
     * Atribut
     * id : ID pengguna
     * username : untuk menyimpan nama pengguna
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

    public User(String name, String username, String email, String password, String phoneNumber, String dateOfBirth, String address) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void add(User user) {
    }
}
