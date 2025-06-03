package factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform) {
        if(supportedPlatform == SupportedPlatform.ANDROID){
            return new AnfroidUIFactory();
        }
        else if(supportedPlatform == SupportedPlatform.IOS){
            return new IOSUIFactory();
        }
        return null;
    }
}
