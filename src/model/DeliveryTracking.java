package model;
//evelline 03081220027

    /*
     * Deskripsi:
     * Atribut
     * trackingNumber : untuk nomor pelacakan pengiriman
     * status : untuk status pengiriman
     * Driver : untuk informasi nama driver
     * Task
     * User bisa memantau orderan yang dipesan sudah sampai mana 
     * User bisa melihat informasi driver
     */
    public class DeliveryTracking{
        private String trackingNumber;
        private String status;
        private String driver;
    
        public String getTrackingNumber() {
            return trackingNumber;
        }
    
        public void setTrackingNumber(String trackingNumber) {
            this.trackingNumber = trackingNumber;
        }
    
        public String getStatus() {
            return status;
        }
    
        public void setStatus(String status) {
            this.status = status;
        }
    
        public String getDriver() {
            return driver;
        }
    
        public void setDriver(String driver) {
            this.driver = driver;
        }
    }
