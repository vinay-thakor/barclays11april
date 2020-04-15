package uk.co.barclays.pages;


import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {
    //Click on bank Dropdown link
    By bankDropDownLink = By.linkText("Bank");
    //mouse hover on borrow link
    By borrowDropDownLink = By.linkText("Borrow");

    //create method for mouse Hover on BankLink
    public void mouseHoverbankDropDownLink() {
        waitUntilPresenceOfElementLocated(By.linkText("Bank"),40);
        mouseHoverToElement(bankDropDownLink);
    }

    //create method for mouse hover on Borrow Link
    public void mouseHoverBorrowAndclickOnDropDownLink(){
        waitUntilPresenceOfElementLocated(By.linkText("Borrow"),40);

        mouseHoverToElementAndClick(borrowDropDownLink);
    }

}