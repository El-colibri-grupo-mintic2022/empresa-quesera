package Model;

import org.apache.catalina.User;


public class profile {

    private String id;
    private String image;
    private String phone;
    private User user;
    private updatedAt date;
    private updatedAt date1;


    public profile(String id, String image, String phone, User user, updatedAt date, updatedAt date1) {
            this.id = id;
            this.image = image;
            this.phone = phone;
            this.user = user;
            this.date = date;
            this.date = date1;
        }



        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public updatedAt getDate1() {
            return date1;
        }

        public void setDate1(updatedAt date) {
            this.date = date;
        }

        public void setDate(updatedAt date) {
            this.date = date;
        }

    }


