package org.example;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider
    public Object[][] loginDetails(){
        Object[][] data = {{"Apple","123"},{"Redmi","345"},{"Samsung","789"}};
        return data;
    }
}
