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
        
        public User() {
            // Empty constructor
        }
        
        public User(String id, String username, String email, String password) {
            this.id = id;
            this.username = username;
            this.email = email;
            this.password = password;
        }
        
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
        
        @Override
        public String toString() {
            return "User{" +
                    "id='" + id + '\'' +
                    ", username='" + username + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
        
        public static void main(String[] args) {
            User user1 = new User();
            user1.setId("1");
            user1.setUsername("eve");
            user1.setEmail("eve@gmail.com");
            user1.setPassword("123456");
    
            System.out.println(user1.toString());
    
            User user2 = new User("2", "tyne.theo", "tyne.theo@gmail.com", "abcdef");
    
            System.out.println(user2.toString());
        }
    }
    