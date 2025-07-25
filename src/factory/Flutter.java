package factory;

public class Flutter {

    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setRefreshRate(){
        System.out.println("Setting refresh rate");
    }

    public UIFactory createFactory(){
        return  UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
