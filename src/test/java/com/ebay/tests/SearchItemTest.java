package com.ebay.tests;

import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{

    @Test
    public void searchItemPositiveTest() {
        app.getSelect().clickOnDepartmentLink();
//        app.getSelect().selectSection();
//        app.getSelect().selectBrand();
//        app.getItem().getSecondItemName();
//        app.getItem().enterItemNameToSearchBar(secondItemName);
//        app.getItem().getFirstItemName();

    }
}

   /*   Select section ‘Handys & Smartphones’
        Select ‘Apple’
        Remember second element in search results
        Enter the memorized value in the search bar
        Find and check that the product name matches the stored value

        Conditions:

        Provide parameterization of test data
        The execution result should be a log
        The source code of the project must be posted on github or bitbucket*/
