package com.spring.SpringBoot.patterns.builder.repeat;

public class AndroidExample2 {


    static class AlertDialog {

        private String title;
        private String message;
        private String icon;

        @Override
        public String toString() {
            return "AlertDialog{" +
                    "title='" + title + '\'' +
                    ", message='" + message + '\'' +
                    ", icon='" + icon + '\'' +
                    '}';
        }

        public void show(){
            System.out.println(this);
        }

        public AlertDialog(String title, String icon, String message) {
            this.title = title;
            this.icon = icon;
            this.message = message;
        }



        static class Builder{
            private String title;
            private String message;
            private String icon;

            public Builder(Object o){

            }

            public AlertDialog create(){
                return new AlertDialog(title, icon, message);
            }

            public Builder setTitle(String title){
                this.title = title;
                return this;
            }

            public Builder setMessage(String message){
                this.message = message;
                return this;
            }

            public Builder setIcon(String icon){
                this.icon = icon;
                return this;
            }

        }
    }



    public static void main(String[] args) {
        AlertDialog.Builder builder = new AlertDialog.Builder(null);
        builder.setTitle("title2");
        builder.setMessage("message3");
        builder.setIcon("icon5");

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

}