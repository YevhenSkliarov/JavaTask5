package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashboardHelper;
import com.it.helpers.LetterHelper;
import com.it.helpers.LoginHelper;

public class App {
    public CommonHelper common;
    public DashboardHelper dashboard;
    public LoginHelper login;
    public LetterHelper letter;

    public App() {
        this.common = new CommonHelper();
        this.dashboard = new DashboardHelper();
        this.login = new LoginHelper();
        this.letter = new LetterHelper();
    }
}
