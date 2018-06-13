package com.company.js.web.screens;

import com.company.js.web.gui.components.JsComponent;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.TextField;

import javax.inject.Inject;
import java.util.Map;

public class DemoScreen extends AbstractWindow {

    @Inject
    protected JsComponent jsComponent;

    @Inject
    protected TextField messageText;

    @Override
    public void init(Map<String, Object> params) {
        messageText.setValue("Hello, world!");
    }

    public void onShowMessageClick() {
        jsComponent.alert(messageText.getValue());
    }
}