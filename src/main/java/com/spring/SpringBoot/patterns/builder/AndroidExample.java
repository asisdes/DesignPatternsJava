package com.spring.SpringBoot.patterns.builder;

public class AndroidExample {

    static class AlertDialog{

        private String title;
        private String message;
        private String icon;

        public AlertDialog(String title, String message, String icon) {
            this.title = title;
            this.message = message;
            this.icon = icon;
        }

        @Override
        public String toString() {
            return "AlertDialog{" +
                    "title='" + title + '\'' +
                    ", message='" + message + '\'' +
                    ", icon='" + icon + '\'' +
                    '}';
        }

        public void show() {
            System.out.println(this);
        }

        static class Builder{

            private String title;
            private String message;
            private String icon;

            public Builder(Object o) {
            }

            public AlertDialog create() {
                return new AlertDialog(title, message, icon);
            }

            public Builder setTitle(String title) {
                this.title = title;
                return this;
            }

            public Builder setMessage(String message) {
                this.message = message;
                return this;
            }

            public Builder setIcon(String icon) {
                this.icon = icon;
                return this;
            }

        }
    }

    public static void main(String[] args) {
        AlertDialog.Builder builder = new AlertDialog.Builder(null);
        builder.setTitle("New Title").setMessage("Builder Pattern").setIcon("Super Icon");

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
