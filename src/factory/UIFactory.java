package factory;

import factory.buttons.Button;
import factory.dropdown.Dropdown;
import factory.menu.Menu;

public interface UIFactory {

   Button createButton();

   Menu createMenu();

   Dropdown createDropDown();

}
