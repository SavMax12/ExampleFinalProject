package services;

import pages.SuccessPage;

public class SuccessService {

    private final SuccessPage successPage = new SuccessPage();

    public boolean isPageShown(){
        return successPage.getSuccessTitle().isDisplayed();
    }
}
