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
     * phoneNumber : untuk menyimpan nama pelanggan
     * Task
     * User dapat mengedit informasi pribadi
     */   
     public class User {
        private String id;
        private String username;
        private String email;
        private String password;
        
        public String getId() {
            return id;
        }
        
        public void setId(String id) {
            this.id = id;
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
    }
 
 