package com.company.js.web.screens;

import com.company.js.web.gui.components.JsComponent;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.TextField;

import javax.inject.Inject;

public class DemoScreen extends AbstractWindow {

    @Inject
    protected JsComponent jsComponent;

    @Inject
    protected TextField messageText;


    public void onShowMessageClick() {
        jsComponent.alert(messageText.getValue());
    }
}