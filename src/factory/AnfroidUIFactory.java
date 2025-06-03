package factory;

import factory.buttons.AndroidButton;
import factory.buttons.Button;
import factory.dropdown.AndroidDropdown;
import factory.dropdown.Dropdown;
import factory.menu.AndroidMenu;
import factory.menu.Menu;

public class AnfroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return  new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropDown() {
        return new AndroidDropdown();
    }
}
