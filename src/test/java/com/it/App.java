package com.it;

import com.it.helpers.*;

public class App {
    public CommonHelper common;
    public DashboardHelper dashboard;
    public LoginHelper login;
    public CreateCreateLetterHelper letter;
    public IncomeLetterHelper incomeLetter;

    public App() {
        this.common = new CommonHelper();
        this.dashboard = new DashboardHelper();
        this.login = new LoginHelper();
        this.letter = new CreateCreateLetterHelper();
        this.incomeLetter = new IncomeLetterHelper();
    }
}
