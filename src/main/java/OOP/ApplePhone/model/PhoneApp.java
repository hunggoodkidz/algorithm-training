package OOP.ApplePhone.model;

public abstract class PhoneApp {

    protected String appName;

    // Constructor
    public PhoneApp(String appName) {
        this.appName = appName;
    }

    // Phương thức abstract để mô tả tính năng của ứng dụng
    public abstract void showAppDetails();

}
