package factory;

import factory.buttons.Button;
import factory.buttons.IOSButton;
import factory.dropdown.Dropdown;
import factory.dropdown.IOSDropdown;
import factory.menu.IOSMenu;
import factory.menu.Menu;

public class IOSUIFactory  implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropDown() {
        return new IOSDropdown();
    }
}
