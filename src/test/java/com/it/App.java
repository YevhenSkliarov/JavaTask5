package com.it;

import com.it.helpers.*;

public class App {
    public CommonHelper common;
    public DashboardHelper dashboard;
    public LoginHelper login;
    public CreateLetterHelper letter;
    public IncomeLetterHelper incomeLetter;

    public App() {
        this.common = new CommonHelper();
        this.dashboard = new DashboardHelper();
        this.login = new LoginHelper();
        this.letter = new CreateLetterHelper();
        this.incomeLetter = new IncomeLetterHelper();
    }
}
