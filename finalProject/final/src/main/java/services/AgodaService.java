package services;

import pages.AgodaPage;

public class AgodaService {

    private final AgodaPage agodaPage = new AgodaPage();

    public void createAccount(){
        agodaPage.getNavBar().createAccount();
    }
}
