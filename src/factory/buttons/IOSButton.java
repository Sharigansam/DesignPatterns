package factory.buttons;

public class IOSButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("changing size of an IOS Button");
    }
}
